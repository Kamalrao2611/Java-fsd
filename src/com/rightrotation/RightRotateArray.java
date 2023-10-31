package com.rightrotation;


import java.util.Arrays;

public class RightRotateArray {
	public static void rotate(int[] nums ,int numOfSteps) {
		numOfSteps = numOfSteps%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,numOfSteps-1);
		reverse(nums,numOfSteps,nums.length-1);
	}
	public static void reverse(int[] nums, int start, int end) {
		while(start<end)
		{
			int temp =nums[start];
			nums[start]=nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int numOfSteps=5;
		rotate(arr,numOfSteps);
		System.out.println(Arrays.toString(arr));
	}
}