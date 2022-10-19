package Corejava;

import java.util.Scanner;


    class Arrayinput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the size of array");
		int a = sc.nextInt();
		// declaring the array
		int arr[] = new int[a];
		// traversing the array
		System.out.println("enter the element");
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		//traversing the array to find sum
		for(int i=0; i<a; i++) {
				
				sum = sum-arr[i];
			}
		System.out.println("Sum of all element of the array is" +sum);
		}
		
	}

