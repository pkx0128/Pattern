package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/7 12:04 上午
 */

/**
 * AnimalFactory的具体实现类DogFactory工厂
 */
public class DogFactory extends AnimalFactory {

    /**
     * 返回Dog类的对象
     * @return Dog类实例对象
     */
    @Override
    public Animal getAnimalObject() {
        return new Dog();
    }

}
