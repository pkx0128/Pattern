package com.pankx.adapterpattern.carcontroller;

/**
 * @author pankx
 * @date 2020/12/20 12:20 上午
 */

/**
 * 适配器类
 */
public class Adapter extends CarController {
    private Lamp lamp;
    private Sound sound;

    public Adapter(){
        lamp = new Lamp();
        sound = new Sound();
    }


    @Override
    public void phonate(){
        sound.alarmSound();
    }

    @Override
    public void twinkle(){
        lamp.alarmLamp();
    }
}
