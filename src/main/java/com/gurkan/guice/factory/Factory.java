package com.gurkan.guice.factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.gurkan.guice.config.GuiceConfig;

public class Factory {
    private static Injector injector;

    public static <T> T get(Class<T> clazz) {
        if (injector == null) {
            injector = Guice.createInjector(new GuiceConfig());
        }
        return injector.getInstance(clazz);
    }
}
