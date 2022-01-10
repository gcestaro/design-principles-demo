package com.github.gcestaro.designprinciples.ioc;

@MyComponent
public class MyApp {

    @MyAutowiredAnnotation
    @MyQualifier(value = "someServiceImpl")
    private SomeService someService;

    public void display() {
        String one = someService.findOne();

        System.out.println(one);
    }
}