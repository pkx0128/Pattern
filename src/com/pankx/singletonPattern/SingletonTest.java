package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/17 8:05 下午
 */

/**
 * 单例模式测试方法
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.getSinleton();
        Singleton singletonB = Singleton.getSinleton();

        System.out.println(singletonA == singletonB);//结果返回true表明俩对象为同一对象实例


    }
}
