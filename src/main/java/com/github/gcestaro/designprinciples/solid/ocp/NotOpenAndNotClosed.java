package com.github.gcestaro.designprinciples.solid.ocp;

import java.util.Random;

import com.github.gcestaro.designprinciples.solid.ocp.models.A;
import com.github.gcestaro.designprinciples.solid.ocp.models.AImpl;
import com.github.gcestaro.designprinciples.solid.ocp.models.B;
import com.github.gcestaro.designprinciples.solid.ocp.models.BImpl;

public class NotOpenAndNotClosed {

    private A a = new AImpl();

    private B b = new BImpl();

    public void execute() {
        int randomNumber = new Random().nextInt(10) + 1;

        if (randomNumber % 2 == 0) {
            a.execute();
            b.execute();
        } else if (randomNumber % 5 == 0) {
            b.execute();
        } else {
            a.execute();
        }
    }
}
