package com.suminrange;

import java.util.Scanner;

public class SumInRange {
	
	static int sumInRange(int[] arr, int L, int R) {
		int sum = 0;
		if(arr.length < 4) {
			System.out.println("Enter a larger array. ");
		}
		else {
			for(int i=L; i<=R; i++) {
				sum+= arr[i];
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements, ");
		int arrLength = sc.nextInt();
		
		int arr[] = new int[arrLength];
		System.out.println("Enter the elements");
		
		for(int i: arr) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of L ");
		int L = sc.nextInt();
		
		System.out.println("Enter the value of R ");
		int R = sc.nextInt();
		
		int sum = sumInRange(arr, L, R);
		System.out.println("Sum of numbers in range " + L + " and " + R + " is " + sum);
	}

}
