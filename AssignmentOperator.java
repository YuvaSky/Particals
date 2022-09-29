/**
 * 
 */
package Corejava;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[]agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		int num1 = sc.nextInt();
		System.out.println("enter second value");
		int num2 =sc.nextInt();
		
		//Adding an Assining value
		num1 += num2;
		System.out.println("num1 ="+num1);
		//subtracting and Assining value
		num2 -= num1;
		System.out.println("num2="+num2);
		
		//Multipying and aasining value
		
		num2 *= num1;
		System.out.println("num2="+num2);
		
		//Division and assining value
		num2 /= num1;
		System.out.println("num2="+num2);
		
		//Module and assining value
		num2 %= num1;
		System.out.println("num2="+num2);
		
	}
	

}
