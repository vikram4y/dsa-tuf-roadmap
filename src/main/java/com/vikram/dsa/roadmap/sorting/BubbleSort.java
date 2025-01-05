package com.vikram.dsa.roadmap.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = {13,46,24,52,20,9};
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array = "+ Arrays.toString(arr));
    }

    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i ; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
