package com.github.gcestaro.designprinciples.solid.ocp.models;

public class CImpl implements C {

    @Override
    public void execute(int someInt) {
        if (someInt % 2 == 0) {
            System.out.println("Executing CImpl");
        }
    }
}
