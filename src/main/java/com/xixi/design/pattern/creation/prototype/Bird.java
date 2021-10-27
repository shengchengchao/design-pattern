package com.xixi.design.pattern.creation.prototype;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public abstract class Bird implements Cloneable{

    abstract void fly();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object target =null;
        target =super.clone();

        return target;
    }
}
