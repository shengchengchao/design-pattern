package com.xixi.design.pattern.structural.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class combinationDemo {


    public static void main(String[] args) {
        Employ CEO = new Employ("CEO","root",11111);
        Employ sub1 = new Employ("王","comp",111);
        Employ sub2 = new Employ("李","hr",111);
        Employ sub3 = new Employ("赵","hr2",113);
        Employ sub4 = new Employ("钱","comp1",113);
        List<Employ> objects = new ArrayList<>();
        objects.add(sub1);
        objects.add(sub2);
        CEO.setSubordinate(objects);
        List<Employ> objects1 = new ArrayList<>();
        objects1.add(sub3);
        sub1.setSubordinate(objects1);

        List<Employ> objects2 = new ArrayList<>();
        objects2.add(sub4);
        sub2.setSubordinate(objects2);

        System.out.println(CEO);
        for (Employ employ : CEO.getSubordinate()) {

            System.out.println(employ);
            for (Employ employ1 : employ.getSubordinate()) {
                System.out.println(employ1);
            }
        }

    }
}
