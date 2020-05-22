package com.example.demo.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @program: demo-test
 * @author: Domi
 * @create: 2020-03-12 22:40
 **/
public class MD5Util {
    public static String encryptToMD5(String string) {
        return DigestUtils.md5Hex(string);
    }

    public static void main(String[] args) {
        String res = encryptToMD5("123456");
        System.out.println(res);
    }
}
