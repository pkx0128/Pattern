package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 12:45 上午
 */

/**
 * 实现接口的实现类
 */
public class WindowsImage implements Imageimpl {
    @Override
    public void showImage() {
        System.out.println("Windows系统显示图片");
    }
}
