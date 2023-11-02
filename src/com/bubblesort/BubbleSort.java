package com.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,20,5,8,104,567,88,90};
		sortFunc(arr);
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	static int[] sortFunc(int arr[]) {
		 int n = arr.length;  
	     int temp = 0;  
	     for(int i=0; i < n; i++){  
	         for(int j=1; j < (n-i); j++){  
	        	 if(arr[j-1] > arr[j]){                    
	                temp = arr[j-1];  
	                 arr[j-1] = arr[j];  
	                 arr[j] = temp;  
	              	}  
	         }
	     }
		return arr;
			
	}
}
