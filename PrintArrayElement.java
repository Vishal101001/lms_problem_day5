package com.ArrayException;

public class PrintArrayElement {

	
	    public static void main(String[] args) {
	        // Declare and initialize an array of size 100
	        int[] numbers = new int[100];
	        
	        // Populate the array with values from 1 to 100
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = i + 1;
	        }
	        
	        // Print the elements of the array
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + " : " + numbers[i]);
	        }
	    }
	}
