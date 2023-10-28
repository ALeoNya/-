package com.example.secondhandcardemo.service;

public interface RedisService {
    /**
     * Key:String缓存
     */
    boolean cacheValue(String key, String value, long time);

    /**
     * 根据key获取Key:String缓存
     */
    String getValue(String key);
}
