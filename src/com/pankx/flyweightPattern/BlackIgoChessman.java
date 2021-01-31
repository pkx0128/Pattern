package com.pankx.flyweightPattern;

/**
 * @author pankx
 * @date 2021/1/31 1:00 上午
 */

/**
 * 抽象享元类IgoChessman的具体享元类
 */
public class BlackIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}
