package com.xixi.design.pattern.structural.adapter;

/**
 * 适配器与桥接模式很像 都是采用了组合的模式来替换结成继承，
 * 但是桥接模式 是将实现与抽象进行一个单独解耦，通过调用抽象的方式 来进行处理
 * 目前来看 结构型的设计模式 都采用了面向接口编程，以及多态的特性来作为基础来完成，
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class MyMediaPlayer implements MediaPlayer {


    private AdvanceMediaPlayer advanceMediaPlayer;

    private void initialize(String type){
        if("vlc".equals(type)){
            advanceMediaPlayer= new VlcMediaPlayer();
        }else if("mp3".equals(type)){
            advanceMediaPlayer= new Mp3MediaPlayer();
        }
        return;

    }

    @Override
    public void playMedia(String type, String filename) {

        initialize(type);
        advanceMediaPlayer.play(filename);
    }

    public static void main(String[] args) {
        MyMediaPlayer myMediaPlayer = new MyMediaPlayer();
        myMediaPlayer.playMedia("vlc","测试");

    }
}
