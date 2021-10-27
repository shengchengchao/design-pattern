package com.xixi.design.pattern.structural.adapter;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class VlcMediaPlayer implements AdvanceMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("vlc 进行处理" +fileName);
    }
}
