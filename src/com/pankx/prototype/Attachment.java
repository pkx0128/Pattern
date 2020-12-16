package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 12:44 上午
 */

/**
 * 定义周报附件类
 */
public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件：" + name);
    }
}
