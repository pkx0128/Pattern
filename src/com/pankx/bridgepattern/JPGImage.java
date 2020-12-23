package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 12:33 上午
 */

/**
 * 抽象类的实现类
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imageimpl.showImage();
        System.out.println(fileName + "JPG格式");
    }
}
