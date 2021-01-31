package com.pankx.flyweightPattern;

/**
 * @author pankx
 * @date 2021/1/31 1:02 上午
 */

/**
 * 抽象享元类IgoChessman的具体享元类
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
