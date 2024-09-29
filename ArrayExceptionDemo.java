package com.ArrayException;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        // Declare an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};
        
        // try to access an index that is out of bounds
        try {
            // This will throw ArrayIndexOutOfBoundsException
            int invalidAccess = numbers[5]; // Index 5 does not exist (array size is 5, so valid indexes are 0-4)
            System.out.println("This will not print: " + invalidAccess);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException!");
            System.out.println("Error: " + e.getMessage());
        }
        
        // Continue with normal execution
        System.out.println("Program continues after the exception handling.");
    }
}
