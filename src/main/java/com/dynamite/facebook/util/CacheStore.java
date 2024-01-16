package com.dynamite.facebook.util;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class CacheStore<T> {
    private Cache<String, T> cache;
    public CacheStore(int expireDuration, TimeUnit timeUnit) {
        this.cache = CacheBuilder.newBuilder()
                .expireAfterWrite(expireDuration, timeUnit)
                .concurrencyLevel(Runtime.getRuntime().availableProcessors())
                .build();
    }
    public T get(String key) {
        return cache.getIfPresent(key);
    }
    public void put(String key, T value) {
        if (key != null && value != null)
            cache.put(key, value);
    }
}
