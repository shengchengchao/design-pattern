package com.xixi.design.pattern.creation.singleton;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class DoubleCheckSingleton {

    private volatile DoubleCheckSingleton singleton;

    private  DoubleCheckSingleton(){

    }


    public DoubleCheckSingleton getSingleton() {
        if(singleton==null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton==null){
                    return new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
