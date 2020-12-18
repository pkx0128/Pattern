package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/18 12:21 下午
 */

/**
 * 饿汉单例模式
 */
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();//饿汉式单例实现为在创建静态变量时就实例化对象

    private EagerSingleton(){};

    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }

}
