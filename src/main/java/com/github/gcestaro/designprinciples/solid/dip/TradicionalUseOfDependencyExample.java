package com.github.gcestaro.designprinciples.solid.dip;

public class TradicionalUseOfDependencyExample {

    private SomeInterfaceExample abstraction;

    public TradicionalUseOfDependencyExample() {
        this.abstraction = new SomeInterfaceImplExample();
    }

}
