package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 12:49 上午
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Image image = new JPGImage();
        Imageimpl imageimpl = new WindowsImage();
        image.setImageimpl(imageimpl);
        image.parseFile("小明");
    }
}
