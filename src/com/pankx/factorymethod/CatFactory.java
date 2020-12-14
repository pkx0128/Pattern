package com.pankx.factorymethod;

/**
 * @author pankx
 * @date 2020/12/7 12:08 上午
 */

/**
 * AnimalFactory的具体实现类CatFactory
 */
public class CatFactory extends AnimalFactory {

    @Override
    public Animal getAnimalObject(){
        return new Cat();
    }

}
