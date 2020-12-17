package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/17 7:52 下午
 */

/**
 * 单例模式的实现
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){};//设置构造方法为私有防止外部实现对象

    public static Singleton getSinleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
