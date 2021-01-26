package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/27 12:03 上午
 */

/**
 * 外观模式中的子系统类
 * 对象字符串做计算加密
 */
public class CipherMachine {
    public String encrypt(String str) {
        System.out.println("对字符串"+ str + "加密");

        String es = "";
        for(int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i) % 7);
            es += s;
        }
        System.out.println("加密后的密文为：" + es);
        return es;
    }
}
