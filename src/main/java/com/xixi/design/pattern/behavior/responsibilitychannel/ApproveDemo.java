package com.xixi.design.pattern.behavior.responsibilitychannel;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class ApproveDemo {

    public static void main(String[] args) {
        FirstApprove firstApprove = new FirstApprove();
        SecondApprove secondApprove = new SecondApprove();
        firstApprove.setSubordinate(secondApprove);

        firstApprove.approve();
    }
}
