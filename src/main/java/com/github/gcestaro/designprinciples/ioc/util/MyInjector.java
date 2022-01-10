package com.github.gcestaro.designprinciples.ioc.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

import com.github.gcestaro.designprinciples.ioc.MyComponent;

public class MyInjector {

    private Map<Class<?>, Class<?>> diMap;

    private Map<Class<?>, Object> applicationScope;

    public MyInjector() {
        super();
        diMap = new HashMap<>();
        applicationScope = new HashMap<>();
    }

    public <T> T getService(Class<T> classz) {
        try {
            return this.getBeanInstance(classz);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /** initialize the injector framework */
    public void initFramework(Class<?> mainClass)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

        Class<?>[] classes = ClassLoaderUtil.getClasses(mainClass.getPackage().getName());
        
        Reflections reflections = new Reflections(mainClass.getPackage().getName());
        
        Set<Class<?>> types = reflections.getTypesAnnotatedWith(MyComponent.class);

        for (Class<?> implementationClass : types) {
            Class<?>[] interfaces = implementationClass.getInterfaces();
            if (interfaces.length == 0) {
                diMap.put(implementationClass, implementationClass);
            } else {
                for (Class<?> iface : interfaces) {
                    diMap.put(implementationClass, iface);
                }
            }
        }

        for (Class<?> classz : classes) {
            if (classz.isAnnotationPresent(MyComponent.class)) {
                Object classInstance = classz.newInstance();
                applicationScope.put(classz, classInstance);
                InjectionUtil.autowire(classz, classInstance,
                        applicationScope, diMap);
            }
        }
    }

    /**
     * Create and Get the Object instance of the implementation class for input
     * interface service
     */
    @SuppressWarnings("unchecked")
    private <T> T getBeanInstance(Class<T> interfaceClass) throws InstantiationException, IllegalAccessException {
        return (T) InjectionUtil.getBeanInstance(interfaceClass,
                diMap, applicationScope, null, null);
    }
}
