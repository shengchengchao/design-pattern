package com.xixi.design.pattern.behavior.strategy;

import java.util.HashMap;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class BirdDemo {


    private static HashMap<String, Bird> hashMap = new HashMap<>();

    static {
        hashMap.put("penguin",new Penguin());
        hashMap.put("swallow",new Swallow());
    }

    public static void main(String[] args) {
        Bird swallow = hashMap.get("swallow");
        swallow.fly();
    }
}
