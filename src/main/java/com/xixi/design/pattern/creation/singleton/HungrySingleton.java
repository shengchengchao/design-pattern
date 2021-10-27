package com.xixi.design.pattern.creation.singleton;

/**
 *  饿汉式 启动式加载 
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();



    private HungrySingleton(){

    }

    private  HungrySingleton getSingleton(){
        return singleton;
    }

}
