package com.xixi.design.pattern.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用clone的方式 来减少 对象new而带来的效率问题
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class BirdCache {

    private static Map<String, Bird> hashMap = new HashMap<>();

    static {
        hashMap.put("Penguin",new Penguin());
    }


    private void getCached(String name) throws CloneNotSupportedException {
        Bird bird = hashMap.get(name);
        Bird clone = (Bird)bird.clone();
        clone.fly();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        BirdCache birdCache = new BirdCache();
        
        birdCache.getCached("Penguin");
    }
}
