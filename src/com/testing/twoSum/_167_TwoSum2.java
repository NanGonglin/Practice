package com.testing.twoSum;

/**
 * @Classname _167_TwoSum2
 * @Description 类型说明
 * @Date 2021/4/12 15:40
 * @Created by 测试园
 */
public class _167_TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
