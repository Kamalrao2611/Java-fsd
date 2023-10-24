package com.array;

public class Arrays {

	public static void main(String[] args) {

		//single-dimensional array
		int arr[]= {343,122,11,453,342,12};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements of array a: "+arr[i]);
		}


		//multidimensional array
		int[][] multiArr = {
				{5, 3, 9, 10}, 
				{10, 5, 7,1} };

		System.out.println("\nLength of row 1: " + multiArr[0].length);
	}

}