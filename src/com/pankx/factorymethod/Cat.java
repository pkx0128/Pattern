package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/7 12:02 上午
 */

/**
 * Animal的具体实现类Cat
 */
public class Cat extends Animal {

    @Override
    public void shut(){
        System.out.println("Cat会叫喵喵喵");
    }
}
