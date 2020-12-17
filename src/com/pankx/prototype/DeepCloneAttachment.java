package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 12:36 下午
 */

import java.io.Serializable;

/**
 * 深度克隆中的附件类
 */
public class DeepCloneAttachment implements Serializable { //要实现深度克隆需要实现接口Serializable
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doenload(){
        System.out.println("下载附件：" + this.name);
    }
}
