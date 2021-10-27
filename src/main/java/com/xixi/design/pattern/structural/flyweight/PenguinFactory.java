package com.xixi.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class PenguinFactory {

    private static HashMap<String, Weight> map =new HashMap<>();
    static {
        map.put("red",new Weight(2,10));
        map.put("green",new Weight(3,11));
    }

    public Penguin getBird(String color){
        Penguin penguin = new Penguin(color);
        penguin.setWeight(map.get(color));
        return penguin;
    }
}
