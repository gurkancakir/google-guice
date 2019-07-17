package com.gurkan.guice.impl;

import com.gurkan.guice.interfaces.ICalculater;

public class MultiplyCalculater implements ICalculater {

    public int calculate(int param1, int param2) {
        return param1 * param2;
    }
}
