package com.gurkan.guice;

import com.google.inject.Inject;
import com.gurkan.guice.interfaces.ICalculater;

public class CalculaterManager {
    private ICalculater calculater;

    @Inject
    public CalculaterManager(ICalculater calculater) {
        this.calculater = calculater;
    }

    public int calculate(int param1, int param2) {
        return this.calculater.calculate(param1, param2);
    }
}
