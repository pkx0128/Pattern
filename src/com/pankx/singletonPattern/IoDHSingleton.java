package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/18 11:38 下午
 */

/**
 * IoDH方式实现单例模式为java语言特有的单例实现方式其特点
 * 1.延时实现化单例对象
 * 2.线程安全
 * 3.不影响系统性能
 */
public class IoDHSingleton {
    private IoDHSingleton() {}

    private static class Singletoninner {
        final static IoDHSingleton ioDhSingleton = new IoDHSingleton();
    }

    public static IoDHSingleton getIoDHSingleton() {
        return Singletoninner.ioDhSingleton;
    }
}


