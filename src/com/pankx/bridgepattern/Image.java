package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 12:27 上午
 */

/**
 * 桥接模式中的抽象类
 *
 */
public abstract class Image {
    protected Imageimpl imageimpl;

    public void setImageimpl(Imageimpl imageimpl){
        this.imageimpl = imageimpl;
    }

    public abstract void parseFile(String fileName);
}
