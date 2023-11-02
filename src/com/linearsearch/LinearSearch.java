package com.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,20,5,8,104,567,88,90};
		int key = 104;
		
		search(arr, key);

	}
	
	static void search(int arr[], int key) {
		
		int flag = 0;
		int index = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == key) {
				index = i;
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("Element found at index " + index);
		}
		else {
			System.out.println("Element not found. ");
		}
	}

}
