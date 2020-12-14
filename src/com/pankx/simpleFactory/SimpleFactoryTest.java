package com.pankx.simpleFactory;

/**
 * 测试简单工厂模式
 */
public class SimpleFactoryTest {

    public static void main(String[] args){
        Person person = Factory.getPersonObject("student");
        person.printMessage();

        person = Factory.getPersonObject("teacher");
        person.printMessage();
    }
}
