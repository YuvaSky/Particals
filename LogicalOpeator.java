package Corejava;

import java.util.Scanner;

public class LogicalOpeator {
	public static void main(String[] args) {
		//Creating Scanner object to take from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value ");
		int num1 =sc.nextInt();
		System.out.println("enter second value");
		int num2 =sc.nextInt();
		System.out.println("enter third value");
		int num3 =sc.nextInt();
		System.out.print("Performing OR opertor");
		//Using logical OR to verify two constraints
		if((num1<num2)&&(num2==num3)) 
{
	int sum = num1+num2+num3;
	System.out.println("the sum is:" +sum);
}
else { 
	System.out.println("false condition");
		}
		System.out.print("Performing AND operation");
//Using logical AND to verify two constraints
	if((num1<num2)&&(num2==num3))
	{
	int sum = num1+num2+num3;
	System.out.println("the sum is:" +sum);
}
else { 
	System.out.println("false condition");
	}
	System.out.println("Performing NOT operation");
// performing NOT Operator
System.out.println("!(num1<num2)=" + !(num1<num2));
System.out.println("!(num2>num3) = "+ !(num2>num3));
 }
 }
