package com.github.gcestaro.designprinciples.solid.srp;

/**
 * "Gather together the things that change for the same reasons. Separate things
 * that change for different reasons." by Uncle Bob
 * 
 * Code Ref:
 * https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html
 */
public interface Employee {

    Money calculatePay(); // CFO client related

    void save(); // CTO client related

    String reportHours(); // COO client related
}