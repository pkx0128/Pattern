package com.pankx.facadepattern;

import com.pankx.facadepattern.abstractfacadepattern.AbstractEncryptFacade;
import com.pankx.facadepattern.abstractfacadepattern.NewEncryptFacade;

/**
 * @author pankx
 * @date 2021/1/27 12:30 上午
 */
public class FacadeTest {
    public static void main(String[] args) {
        AbstractEncryptFacade encryptFacade = GetFacadeForXml.getEncryptFacade();
        encryptFacade.fileEncrypt("abcd","abcd.txt");
    }
}
