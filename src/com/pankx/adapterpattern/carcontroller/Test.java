package com.pankx.adapterpattern.carcontroller;

/**
 * @author pankx
 * @date 2020/12/20 12:38 上午
 */
public class Test {
    public static void main(String[] args) {
        CarController carController = new Adapter();
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
