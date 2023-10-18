package com.example.secondhandcardemo.service;

public interface RedisService {
    /**
     * Key:String缓存
     */
    boolean cacheValue(String key, String value, long time);
}
