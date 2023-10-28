package com.example.secondhandcardemo.service.serviceImpl;

import com.example.secondhandcardemo.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

public class RedisServiceImpl implements RedisService {
    /**
     * slf4j 日志
     */
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 自定义 key 三种
     *  String key:String value         普通key:value
     *  String key:Set<String> set      key:set集合
     *  String key:List<String> list    key:list集合
     */
    private static final String KEY_PREFIX_KEY = "info:bear:key";
    private static final String KEY_PREFIX_SET = "info:bear:set";
    private static final String KEY_PREFIX_LIST = "info:bear:list";

    @Override
    public boolean cacheValue(String k, String v, long time) {
        try {
            String key = KEY_PREFIX_KEY + k;
            ValueOperations<String, String> ops = redisTemplate.opsForValue();
            ops.set(key, v);
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        } catch (Throwable e) {
            log.error("缓存存入失败key:[{}] value:[{}]", k, v);
        }
        return false;
    }


    @Override
    public String getValue(String key) {
        try {
            ValueOperations<String, String> ops = redisTemplate.opsForValue();
            return ops.get(KEY_PREFIX_KEY + key);
        } catch (Throwable e) {
            log.error("根据 key 获取缓存失败，当前key:[{}],失败原因 Codeor:[{}]", key, e);
        }
        return null;
    }

}