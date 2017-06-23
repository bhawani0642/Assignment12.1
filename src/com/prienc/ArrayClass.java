package com.prienc;
//Here we are creating a class of name ArrayClass
public class ArrayClass {
	//Here we are declaring the main method
	public static void main(String[] args) {
		//Applying the try block
		try {
			//Declaring two array a & b of length 10 & 9 respectively
			int a[] = {0,1,2,3,4,5,6,7,8,9};
			
			int b[] = new int[9];
           //Applying the for loop
			for (int i = 0; i < a.length; i++) {
				//coping the element of array a into array b
				b[i] = a[i];
				//Printing statement
				System.out.println("print the copied array" + b[i]);
			}
		} 
		//Applying catch block to catch the exception
		catch (ArrayIndexOutOfBoundsException aioobe) {
			//printing out the exception message
			System.out.println("we can not store 10 elements in a array of  size 9 ");
		}
	}

}
