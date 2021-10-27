package com.xixi.design.pattern.creation.singleton;

/**  懒汉式 懒加载
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class lazySingleton {

    private  lazySingleton singleton;

    private  lazySingleton(){

    }


    public lazySingleton getSingleton() {
        if(singleton==null){
            singleton=new lazySingleton();
        }
        return singleton;
    }
}
