package com.kangfw.dp;

import java.util.Arrays;

class DXSL {
    public int longestArithSeqLength(int[] A) {
        int len = A.length;
        int maxSize = 0;
        Arrays.sort(A);
        if (A[0] == A[len - 1]) {
            return len;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = j;
                int res = 2;
                int ss = A[j] - A[i];
                for (int m = j + 1; m < len; m++) {
                    if (A[m] -A[temp] == ss) {
                        res++;
                        temp = m;
                    }
                    if (A[m] - ss > A[temp]) {
                        break;
                    }
                }
                if(maxSize < res) {
                    maxSize = res;
                }
            }
        }
        return maxSize;
    }
}