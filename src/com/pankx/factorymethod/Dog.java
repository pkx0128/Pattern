package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/7 12:00 上午
 */

/**
 * Animal的具体实现类Dog
 */
public class Dog extends Animal {

    @Override
    public void shut(){
        System.out.println("Dog叫汪汪汪");
    }

}
