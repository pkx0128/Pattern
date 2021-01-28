package com.pankx.facadepattern.abstractfacadepattern;

/**
 * @author pankx
 * @date 2021/1/28 11:27 下午
 */

/**
 * 抽象外观模式的抽象外观类
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt(String str,String fileName);
}
