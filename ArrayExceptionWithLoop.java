package com.ArrayException;

public class ArrayExceptionWithLoop {

	 public static void main(String[] args) {
	        // Declare an array with 5 elements
	        int[] numbers = {10, 20, 30, 40, 50};
	        
	        // try to access an index that is out of bounds
	        try {
	        	for(int i=0; i<=numbers.length; i++) {
	        		
	        		System.out.println("Access element with index "+i+" "+numbers[i]);
	        	}
	       
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught an ArrayIndexOutOfBoundsException!");
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        // Continue with normal execution
	        System.out.println("Program continues after the exception handling.");
	    }
}
