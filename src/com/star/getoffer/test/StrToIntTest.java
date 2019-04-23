package com.star.getoffer.test;

import com.star.getoffer.impl.StrToInt_1;
import org.junit.Test;

/**
 * 题0测试类
 * 测试数值
 */
public class StrToIntTest {

    @Test
   public void testStrToTest(){
        StrToInt_1 steToInt = new StrToInt_1();
        int result1 = steToInt.StrToInt("1134");
        int result2 = steToInt.StrToInt("adfsf");
        int result3 = steToInt.StrToInt("666aa66a");
        int result4 = steToInt.StrToInt("-123456");
//        System.out.println(result1);
        System.out.println(result1 + " "  + result2 + " "  + result3 + " "  + result4);
    }

}
