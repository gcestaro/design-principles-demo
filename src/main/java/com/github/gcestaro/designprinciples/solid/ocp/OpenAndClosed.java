package com.github.gcestaro.designprinciples.solid.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.github.gcestaro.designprinciples.solid.ocp.models.C;

/**
 * "A Module should be open for extension but closed for modification." by Uncle Bob
 */
public class OpenAndClosed {

    private List<C> cImpls;

    public OpenAndClosed() {
        this.cImpls = new ArrayList<>();
    }

    public OpenAndClosed(C c) {
        this();
        this.addImpl(c);
    }

    public void addImpl(C c) {
        this.cImpls.add(c);
    }

    public void addImpl(C... cImpls) {
        Stream.of(cImpls).forEach(this::addImpl);
    }

    public void execute(int someInt) {
        cImpls.forEach(c -> c.execute(someInt));
    }
}
