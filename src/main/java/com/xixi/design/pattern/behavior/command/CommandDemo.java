package com.xixi.design.pattern.behavior.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class CommandDemo {


    public static void main(String[] args) {
        List<Order> list =new ArrayList<>();
        Person person = new Person();
        list.add(new SellCommand(person));
        list.add(new BuyCommand(person));

        list.forEach(each->each.execute());
    }
}
