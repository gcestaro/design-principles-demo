package com.github.gcestaro.designprinciples.ioc;

import com.github.gcestaro.designprinciples.ioc.util.DIApplication;

@MyApplication
public class MainApplication {
    public static void main(String[] args) {
        DIApplication.run(MainApplication.class, args);
    }
}
