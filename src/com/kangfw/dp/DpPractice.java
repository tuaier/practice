package com.kangfw.dp;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 动态规划——有面值为1、3、5的硬币若干，如何用最少的硬币凑够11元
 *
 * @author kangfw
 * @date 2019-03-10
 */
public class DpPractice {
    public static void main(String[] args) {
        //lengthOfLongestSubstring practice = new lengthOfLongestSubstring();
        //System.out.println(practice.lengthOfLongestSubstring2("pwwkew") + "");
        /*int[] a = new int[]{16,6,1,0,45,56,98,100,51,83,76,14};
        System.out.println(prefixesDivBy5(a));

        DXSL  s = new DXSL();
        int i = s.longestArithSeqLength(a);
        System.out.println(i);*/

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String a = "2019-02-18 12:11:25";

        try {
            Date a1 = df.parse(a);
            System.out.println("");
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public static List<Boolean> prefixesDivBy5(int[] A) {

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            BigDecimal temp = BigDecimal.ZERO;
            int m = i;
            for (int j = 0; j <= i; j++) {
                //temp =  A[j]*Math.pow(2, m--) + temp;
                BigDecimal rn = new BigDecimal("2");
                BigDecimal a = new BigDecimal(A[j]);
                temp = temp.add(rn.pow(m--).multiply(a));
            }
            if (temp.divideAndRemainder(new BigDecimal(5))[1].equals(BigDecimal.ZERO)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }

}
