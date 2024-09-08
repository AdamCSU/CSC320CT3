/*Colorado State University Global 
#24SD-CSC320-2: Programming 1
#Dr. Douglas Mujeye
#September 7, 2024*/

import java.util.Scanner;

public class CalculateAverageWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //creating scanner to user input
		
		System.out.println("Enter your weekly income: ");  //ask user to enter weekly income and store it in income
		double income = scanner.nextDouble();
		
		double taxWithheld = calculateTaxWithheld(income);  //calling calculateTaxWithheld method taking user input income
		
		System.out.printf("Taxes withheld $%.2f this week.", taxWithheld);  //print result

		scanner.close();
	}

	public static double calculateTaxWithheld(double income) {
		double taxRate;
		
		if (income < 500) {  //using user inputted income, find appropriate tax rate
			taxRate = .10;
		} else if (income >= 500 && income < 1500) {
			taxRate = .15;
		} else if (income >= 1500 && income < 2500) {
			taxRate = .20;
		} else {
			taxRate = .30;
		}
		
		return income * taxRate;
	}
}
