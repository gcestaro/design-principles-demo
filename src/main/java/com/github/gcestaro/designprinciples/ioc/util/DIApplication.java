package com.github.gcestaro.designprinciples.ioc.util;

import com.github.gcestaro.designprinciples.ioc.MyApp;
import com.github.gcestaro.designprinciples.ioc.MyApplication;

public class DIApplication {

    private final MyInjector injector;

    public DIApplication() {
        this.injector = new MyInjector();
    }

    public void run(Class<?> mainClassz) {
        boolean hasCustomApplicationAnnotation = mainClassz.isAnnotationPresent(MyApplication.class);
        if (hasCustomApplicationAnnotation) {
            System.out.println("Starting CustomDemoApplication...");
            this.startApplication(mainClassz);
            this.injector.getService(MyApp.class).display();
            System.out.println("\nStopping CustomDemoApplication...");
        } else {
            System.out.println("\nRunning as regular java Application...");
        }
    }

    public void startApplication(Class<?> mainClass) {
        try {
            synchronized (DIApplication.class) {
                this.injector.initFramework(mainClass);

                System.out.println("\nCustomDemoApplication Started....");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void run(Class<?> mainClassz, String[] args) {
        new DIApplication().run(mainClassz);
    }
}