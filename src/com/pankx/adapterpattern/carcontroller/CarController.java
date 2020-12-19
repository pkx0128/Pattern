package com.pankx.adapterpattern.carcontroller;

/**
 * @author pankx
 * @date 2020/12/20 12:15 上午
 */

/**
 * 小车控制器类作为对象适配器模式的目标抽象类
 */
public abstract class CarController {

    public  void move(){
        System.out.println("小车会移动。。。。");
    }

    public abstract void phonate();//发声
    public abstract void twinkle();//灯光闪

}
