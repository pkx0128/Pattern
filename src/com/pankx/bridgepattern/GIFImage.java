package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 12:42 上午
 */

/**
 * 抽象类的实现类
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imageimpl.showImage();
        System.out.println(fileName + "GIF格式");
    }
}
