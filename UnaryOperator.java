package Corejava;

import java.util.Scanner;

public class UnaryOperator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		//performing unary operator
		num1 =-num1;
		System.out.println("Result is :" + num1);
		
		//Performing pre increment operation
		++num1;
		System.out.print("Pre increment :" +num1);
		//Performing post decrement operation
		--num1;
		System.out.print("Post decrement :" +num1);
		//Performing post increment operation
		num1++;
		System.out.print("Post increment :" +num1);
		//Performing post decrement operation
		num1--;
		System.out.print("Post decrement :" +num1);
				
	}

}

