package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class CompleteFactory {

    public AbstractFactory getFactory(String name){

        if("bird".equals(name)){
            return new BirdFactory();
        } else if("color".equals(name)){
            return new ColorFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        CompleteFactory completeFactory = new CompleteFactory();
        AbstractFactory birdFactory = completeFactory.getFactory("bird");
        Bird penguin = birdFactory.getBird("penguin");
        penguin.fly();
    }
}
