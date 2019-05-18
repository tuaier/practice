package com.kangfw.dp;


import java.util.Arrays;

/**
 * 寻找两个有序数组的中位数
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * @author kfw
 * @since 2019/3/21 16:53
 */
public class findMedianSortedArrays {

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int [] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0 , nums1.length);
        System.arraycopy(nums2, 0, nums, 0 , nums2.length);
        Arrays.sort(nums);

        int a=nums.length%2,b=nums.length/2;
        double num;
        if(a!=0){
            num= nums[b];
        }else {
            num= (nums[b]+ nums[b-1])*0.5;
        }
        return num;
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        // todo she pi guaiguai
        return 0.00;
    }
}
