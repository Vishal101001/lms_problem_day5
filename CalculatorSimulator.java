package com.ArrayException;

public class CalculatorSimulator {

	
    public static void main(String[] args) {
        // Create an instance of TaxCalculator
        TaxCalculator taxCalculator = new TaxCalculator();
        
        // Test cases
        testTaxCalculation(taxCalculator, "Ron", 34000, false);    // Test Case 1
        testTaxCalculation(taxCalculator, "Tim", 1000, true);      // Test Case 2
        testTaxCalculation(taxCalculator, "Jack", 55000, true);    // Test Case 3
        testTaxCalculation(taxCalculator, "", 30000, true);        // Test Case 4
    }

    // Helper method to test tax calculation
    private static void testTaxCalculation(TaxCalculator taxCalculator, String empName, double empSal, boolean isIndian) {
        try {
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is: " + taxAmount);
        } catch (com.ArrayException.CalculatorSimulator.TaxCalculator.CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (com.ArrayException.CalculatorSimulator.TaxCalculator.EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (com.ArrayException.CalculatorSimulator.TaxCalculator.TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
public class TaxCalculator {
	    
		// Custom Exception: CountryNotValidException
		class CountryNotValidException extends Exception {
		    public CountryNotValidException(String message) {
		        super(message);
		    }
		}

		// Custom Exception: EmployeeNameInvalidException
		class EmployeeNameInvalidException extends Exception {
		    public EmployeeNameInvalidException(String message) {
		        super(message);
		    }
		}

		// Custom Exception: TaxNotEligibleException
		class TaxNotEligibleException extends Exception {
		    public TaxNotEligibleException(String message) {
		        super(message);
		    }
		}

		
	    // Method to calculate tax
	    public double calculateTax(String empName, boolean isIndian, double empSal) 
	            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	        
	        // Check if the employee name is null or empty
	        if (empName == null || empName.isEmpty()) {
	            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
	        }
	        
	        // Check if the employee is not Indian
	        if (!isIndian) {
	            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
	        }
	        
	        // Tax calculation logic
	        double taxAmount = 0;
	        if (empSal > 100000) {
	            taxAmount = empSal * 8 / 100;
	        } else if (empSal >= 50000 && empSal <= 100000) {
	            taxAmount = empSal * 6 / 100;
	        } else if (empSal >= 30000 && empSal < 50000) {
	            taxAmount = empSal * 5 / 100;
	        } else if (empSal >= 10000 && empSal < 30000) {
	            taxAmount = empSal * 4 / 100;
	        } else {
	            throw new TaxNotEligibleException("The employee does not need to pay tax.");
	        }
	        
	        return taxAmount;
	    }
	}
}
