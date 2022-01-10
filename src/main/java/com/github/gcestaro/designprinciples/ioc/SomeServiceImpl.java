package com.github.gcestaro.designprinciples.ioc;

@MyComponent
public class SomeServiceImpl implements SomeService {

    @Override
    public String findOne() {
        return "Lets go!";
    }
}