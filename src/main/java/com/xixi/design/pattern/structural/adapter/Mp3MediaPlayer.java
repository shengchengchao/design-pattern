package com.xixi.design.pattern.structural.adapter;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class Mp3MediaPlayer implements AdvanceMediaPlayer {

    @Override
    public void play(String fileName) {

        System.out.println("mp3" + fileName);
    }
}
