package com.gurkan.guice.config;

import com.google.inject.AbstractModule;
import com.gurkan.guice.impl.MultiplyCalculater;
import com.gurkan.guice.impl.SumCalculater;
import com.gurkan.guice.interfaces.ICalculater;
import com.gurkan.guice.impl.MinusCalculater;

public class GuiceConfig extends AbstractModule {

    protected void configure() {
        //bind(ICalculater.class).to(SumCalculater.class);
        //bind(ICalculater.class).to(MinusCalculater.class);
        bind(ICalculater.class).to(MultiplyCalculater.class);
    }
}
