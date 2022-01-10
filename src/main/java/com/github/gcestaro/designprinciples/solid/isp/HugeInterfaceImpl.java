package com.github.gcestaro.designprinciples.solid.isp;

import java.util.Collection;

public class HugeInterfaceImpl implements HugeInterfaceBadExample {

    @Override
    public void doThis() {

    }

    @Override
    public void doThat() {

    }

    @Override
    public void doSomethingElse() {

    }

    @Override
    public Collection<Object> findThis() {
        return null;
    }

    @Override
    public Collection<Object> findTaht() {
        return null;
    }

    @Override
    public Collection<Object> findSomethingElse() {
        return null;
    }
}
