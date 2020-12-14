package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/6 11:57 下午
 */

/**
 * 工厂的抽象类
 * 工厂方法模式其产品对象放到工厂的具体实现类中创建
 */
public abstract class AnimalFactory {
    public abstract Animal getAnimalObject();
}
