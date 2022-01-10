package com.github.gcestaro.designprinciples.solid.isp;

import java.util.Collection;

/**
 * 
 * "Keep interfaces small so that users don’t end up depending on things they don’t need." by Uncle Bob
 *
 */
public interface ThisInterfaceSegregationExample {

    void doThis();

    Collection<Object> findThis();
}
