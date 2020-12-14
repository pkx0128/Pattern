package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/7 12:11 上午
 */

/**
 * 工厂方法模式测试方法
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        Dog dog = (Dog)animalFactory.getAnimalObject();
        dog.shut();

        Cat cat = (Cat)XMLUtil.getBean();
        cat.shut();
    }
}
