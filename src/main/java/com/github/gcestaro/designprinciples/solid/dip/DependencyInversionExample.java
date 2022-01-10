package com.github.gcestaro.designprinciples.solid.dip;

public class DependencyInversionExample {

    private SomeInterfaceExample abstraction;

    public DependencyInversionExample(SomeInterfaceExample abstraction) {
        this.abstraction = abstraction;
    }
}
