package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/27 12:30 上午
 */
public class FacadeTest {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("abcd","abcd.txt");
    }
}
