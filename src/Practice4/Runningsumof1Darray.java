package Practice4;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.

import java.util.Arrays;

public class Runningsumof1Darray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 395, 302, 4, 1, 4, 2, 38, 65, 0, 9};
        int[] runningSum = new int[nums.length];
        for (int i = 0, sum=0; i < nums.length; i++) {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
