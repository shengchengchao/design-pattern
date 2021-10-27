package com.xixi.design.pattern.creation.singleton;


/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){

    }

    private static class  Singleton{
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static final StaticInnerSingleton getSingleton(){
        return  Singleton.INSTANCE;
    }

    
}
