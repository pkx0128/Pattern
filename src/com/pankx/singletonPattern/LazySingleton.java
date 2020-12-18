package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/18 12:55 下午
 */

/**
 * 懒汉式单例模式实现
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){};

    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();//懒汉式单例对象实例化放到获取对象的静态公式方法中实现，
                                                // 使用单例对象在第一次被调用时才实例化
        }
        return lazySingleton;
    }

}
