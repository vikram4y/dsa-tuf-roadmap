package com.vikram.dsa.roadmap.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int [] arr = {13,46,24,52,20,9};
        selectionSort.selectionSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

    public void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int minPos = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minPos];
            nums[minPos] = temp;
        }
    }

}
