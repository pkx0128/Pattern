package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 7:33 下午
 */

/**
 * 拥有原型管理的原型设计模式测试类
 */
public class PrototypeMangerClient {
    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        PrototypeDemoB pa = (PrototypeDemoB)prototypeManager.getPrototypeDemo("PrototypeDemoB");
        pa.setAge(30);
        System.out.println(pa.getAge());
    }
}
