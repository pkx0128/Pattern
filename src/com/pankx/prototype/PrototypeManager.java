package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 6:51 下午
 */

import java.util.Hashtable;

/**
 * 原型对象管理类
 */
public class PrototypeManager {
    private Hashtable<String,PrototypeDemo> prototypeDemoList = new Hashtable<String,PrototypeDemo>();

    /**
     * 构造方法
     */
    public PrototypeManager(){
        prototypeDemoList.put("PrototypeDemoA",new PrototypeDemoA());
        prototypeDemoList.put("PrototypeDemoB",new PrototypeDemoB());
    }

    /**
     * 给对象列表Hashtable中添加对象
     * @param s 对象键名
     * @param p 对象值
     */
    public void add(String s,PrototypeDemo p){
        prototypeDemoList.put(s,p);
    }

    /**
     * 获取克制对象的工大方法
     * @param key 存在Hashtable中的原型对象键名
     * @return 克隆对象
     */
    public PrototypeDemo getPrototypeDemo(String key){
        PrototypeDemo prototypeDemo = prototypeDemoList.get(key).clone();
        return prototypeDemo;
    }
}
