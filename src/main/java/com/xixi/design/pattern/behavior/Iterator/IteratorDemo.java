package com.xixi.design.pattern.behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class IteratorDemo {


    private static List<String> list;

    static {
        list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
    }


    static class NameIterator implements Iterator{
        Integer index=0;

        @Override
        public Boolean hasNext() {
            return index<=list.size();
        }

        @Override
        public Object next() {
            if(index+1<list.size()){
                return list.get(++index);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        
        NameIterator nameIterator = new NameIterator();

        System.out.println( nameIterator.hasNext());
    }
}
