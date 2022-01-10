package com.github.gcestaro.designprinciples.solid.isp;

import java.util.Collection;

public interface HugeInterfaceBadExample {

    void doThis();

    void doThat();

    void doSomethingElse();

    Collection<Object> findThis();

    Collection<Object> findTaht();

    Collection<Object> findSomethingElse();
}
