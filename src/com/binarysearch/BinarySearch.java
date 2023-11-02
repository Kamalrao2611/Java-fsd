package com.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,20,5,8,104,567,88,90};
		int key = 567;
		
		search(arr,key);
	}
	
	static void search(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end-start)/2;
		
		
		while(start <= end) {
			if(arr[mid] == key) {
				System.out.println("Element found at index " + mid);
				break;
			}
			
			else if(key > mid) {
				start = mid+1;
			}
			
			else {
				end  = mid-1;
			}
			
			mid = start + (end-start)/2;
		}
	}
}
