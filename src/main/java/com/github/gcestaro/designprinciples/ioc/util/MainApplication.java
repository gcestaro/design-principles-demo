package com.github.gcestaro.designprinciples.ioc.util;

import com.github.gcestaro.designprinciples.ioc.MyApplication;

@MyApplication
public class MainApplication {
    public static void main(String[] args) {
        DIApplication.run(MainApplication.class, args);
    }
}
