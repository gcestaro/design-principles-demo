package com.github.gcestaro.designprinciples.solid.ocp;

import com.github.gcestaro.designprinciples.solid.ocp.models.A;
import com.github.gcestaro.designprinciples.solid.ocp.models.AImpl;

public class NotOpenAndClosed {

    public void execute() {
        A a = new AImpl();
        a.execute();
    }
}
