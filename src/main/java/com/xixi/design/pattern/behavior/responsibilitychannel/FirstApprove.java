package com.xixi.design.pattern.behavior.responsibilitychannel;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class FirstApprove extends ApproveNode {



    @Override
    public void approve() {
        System.out.println("第一个");
        if( getSubordinate()!=null){
            getSubordinate().approve();

        }
    }
}
