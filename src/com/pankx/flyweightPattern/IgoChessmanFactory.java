package com.pankx.flyweightPattern;

/**
 * @author pankx
 * @date 2021/1/31 11:48 下午
 */

import java.util.Hashtable;

/**
 * 享元模式的享元工厂类
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    private static Hashtable<String,IgoChessman> hashtable;//通过Hashtable来存储享元对象，充当享元池

    private IgoChessmanFactory(){
        hashtable = new Hashtable<String,IgoChessman>();
        BlackIgoChessman blackIgoChessman = new BlackIgoChessman();
        hashtable.put("black",blackIgoChessman);
        WhiteIgoChessman whiteIgoChessman = new WhiteIgoChessman();
        hashtable.put("white",whiteIgoChessman);
    }
    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getIgoChessmanFactory(){
        return igoChessmanFactory;
    }
    //通过Key获取存储在hashtable中的享元对象
    public IgoChessman getIgoChessman(String color){
        return hashtable.get(color);
    }

}
