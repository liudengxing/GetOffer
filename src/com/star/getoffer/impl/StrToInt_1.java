package com.star.getoffer.impl;

/**
 * 剑指OFFER 面试题0
 * 把一个字符串转化为整数
 */
public class StrToInt_1 {

    public int StrToInt(String str){

        if(str == null) return -1;
        int strtoint = 0;
        for(int i = 0; i< str.length(); i++){
            char t = str.charAt(i);
            if( t < '0' || t > '9') continue;
            strtoint = strtoint * 10 + (t - '0');
        }
        if(str.charAt(0) == '-') return 0 - strtoint;
        else return strtoint;
    }
}
