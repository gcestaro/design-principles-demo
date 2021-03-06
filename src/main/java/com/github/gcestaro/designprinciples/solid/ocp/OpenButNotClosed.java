package com.github.gcestaro.designprinciples.solid.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import com.github.gcestaro.designprinciples.solid.ocp.models.C;

public class OpenButNotClosed {

    private List<C> cImpls;

    public OpenButNotClosed() {
        this.cImpls = new ArrayList<>();
    }

    public OpenButNotClosed(C c) {
        this();
        this.addImpl(c);
    }

    public void addImpl(C c) {
        this.cImpls.add(c);
    }

    public void addImpl(C... cImpls) {
        Stream.of(cImpls).forEach(this::addImpl);
    }

    public void execute() {
        int randomInt = new Random().nextInt(10) + 1;

        cImpls.forEach(c -> c.execute(randomInt));
    }
}
