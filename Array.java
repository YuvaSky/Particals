package Corejava;

public class Array {
	 static void main(String[] args){
		// Declaring and instantiating the array
		int a[] = new int[4];
		//initilization
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	    a[3] = 7;
	   //traverazing the array
	   for(int i = 0; i<a.length;i++){
		   System.out.println(a[i]);
	   }
	}
}
