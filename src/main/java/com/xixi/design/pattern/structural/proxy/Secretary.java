package com.xixi.design.pattern.structural.proxy;

/**
 * 静态代理  动态代理的话 使用JDK 或者cglib
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class Secretary {


    private Boss boss;

    public Secretary(Boss boss) {
        this.boss = boss;
    }

    private void test1(){
        System.out.println("测试开始");
        boss.talk();
        System.out.println("测试结束");
    }


    public static void main(String[] args) {
        Secretary secretary = new Secretary(new Boss());
        secretary.test1();
    }
}
