package com.pankx.facadepattern.abstractfacadepattern;

/**
 * @author pankx
 * @date 2021/1/28 11:32 下午
 */
public class NewCipherMachine {
    public String encrypt(String str) {
        System.out.println("数据简单加密");
        String es = "";
        int key = 10; //设置密钥，移位数为10
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //小写字母移位
            if (c >= 'a' && c <= 'z') {
                es += c % 26;
                if(c < 'a') {
                    c += 26;
                }
                if(c > 'z') {
                    c -= 26;
                }
            }
            //大写字母移位
            if(c >='A' && c <= 'Z') {
                if(c < 'A') {
                    c += 26;
                }
                if(c > 'Z') {
                    c -= 26;
                }
            }
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
