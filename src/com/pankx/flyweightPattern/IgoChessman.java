package com.pankx.flyweightPattern;

/**
 * @author pankx
 * @date 2021/1/31 12:54 上午
 */

/**
 * 享元模式中的抽象享元类
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(){
        System.out.println("棋子颜色为：" + this.getColor());
    }
}
