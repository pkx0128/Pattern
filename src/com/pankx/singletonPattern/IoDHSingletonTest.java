package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/19 12:14 上午
 */


public class IoDHSingletonTest {

    public static void main(String[] args) {
        IoDHSingleton ioDHSingleton1 = IoDHSingleton.getIoDHSingleton();
        IoDHSingleton ioDHSingleton2 = IoDHSingleton.getIoDHSingleton();

        System.out.println(ioDHSingleton1 == ioDHSingleton2);//返回true
    }
}
