package main;

import java.util.Scanner;

public class Converter {
	
	private static double collectQuantity(String unit1, String unit2, Scanner keyboard) { 
		
		double qty;
		System.out.println("Enter " + unit1+ " to convert to "+ unit2 + ":");
		qty=keyboard.nextDouble();
		return qty;
	}
		
	public static double convertFarenheitToCelsius(double qty) { 
		return ((qty - 32 ) * .5556 );
	}
	
	public static double convertCelsiusToFarenheit (double qty) {
		return ( qty * 1.8 + 32);
	}
	
	
	private static double convertTeaspoonsToCups (double qty) {
		return (qty / 48);
	}
	
	private static double convertTeaspoonsToTablespoons (double qty) {
		return (qty / 3);
	}
	
	public static double convertDollarsToPounds (double qty) {
		return (qty * 0.75);
	}
	
	public static double convertDollarsToEuros (double qty) {
		return (qty * 0.84);
	}
	
	public static double convertYardsToInches (double qty) {
		return (qty * 36);
	}
	
	public static double convertYardsToFeet (double qty) {
		return (qty * 3);
	}


		
	public static void main(String[] args) {
		
	
		int menuSelection = 0;
		double qtyUnit1;
		double qtyUnit2;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (menuSelection != 9)
		{
		System.out.println("Please select Menu option:");
		System.out.println("********** TEMPERATURE CONVERSIONS **********");
		System.out.println("         1. Fahrenheit to Celsius");
		System.out.println("         2. Celsius to Fahrenheit");
		System.out.println("*********************************************");
		System.out.println("********** VOLUME CONVERSIONS ***************");
		System.out.println("         3. Teaspoons to Cups");
		System.out.println("         4. Teaspoons to Tablespoons");
		System.out.println("*********************************************");
		System.out.println("********** CURRENCY CONVERSIONS *************");
		System.out.println("         5. US Dollars to Pounds");
		System.out.println("         6. US Dollars to Euro");
		System.out.println("*********************************************");
		System.out.println("********** LENGTH CONVERSIONS ***************");
		System.out.println("         7. Yards to Inches");
		System.out.println("         8. Yards to Feet");
		System.out.println("*********************************************");
		System.out.println("         9. Quit");
		System.out.println("*********************************************");
		
		
		menuSelection = keyboard.nextInt();
		keyboard.nextLine();
		
		switch(menuSelection)
		{
		case 1:
		    qtyUnit1=collectQuantity("Fahrenheit", "Celsius", keyboard);
		    qtyUnit2=convertFarenheitToCelsius(qtyUnit1);
		    System.out.println(qtyUnit1+" degrees Fahreheit equal " +qtyUnit2 + " degrees Celsius." );
			break;    
		case 2:
		    qtyUnit1=collectQuantity("Celsius", "Fahrenheit", keyboard);
		    qtyUnit2=convertCelsiusToFarenheit(qtyUnit1);
		    System.out.println(qtyUnit1+" degrees Celsius equal " +qtyUnit2 + " degrees Fahreheit." );
			break;    
		case 3:
			qtyUnit1=collectQuantity("teaspoons", "cups", keyboard);
			qtyUnit2=convertTeaspoonsToCups (qtyUnit1);
			System.out.println(qtyUnit1+" teapoons equal " +qtyUnit2 + " cups." );
			break;
		case 4:
			qtyUnit1=collectQuantity("teaspoons", "tablespoons",  keyboard);
			qtyUnit2=convertTeaspoonsToTablespoons(qtyUnit1);
			System.out.println(qtyUnit1+" teaspoons equal " +qtyUnit2 + " tablespoons." );
			break;
		case 5:
			qtyUnit1=collectQuantity("dollars", "pounds",  keyboard);
			qtyUnit2=convertDollarsToPounds(qtyUnit1);
			System.out.println(qtyUnit1+" US dollars equal " +qtyUnit2 + " Sterling pounds." );
		    break;
		case 6:
			qtyUnit1=collectQuantity("dollars", "Euro", keyboard);
			qtyUnit2=convertDollarsToEuros(qtyUnit1);
			System.out.println(qtyUnit1+" US dollars equal " +qtyUnit2 + " Euro." );
		    break;
		case 7:
			qtyUnit1=collectQuantity("yards", "inches", keyboard);
			qtyUnit2=convertYardsToInches(qtyUnit1);
			System.out.println(qtyUnit1+" yards equal " +qtyUnit2 + " inches." );
		    break;
		case 8:
			qtyUnit1=collectQuantity("yards", "feet", keyboard);
			qtyUnit2=convertYardsToFeet(qtyUnit1);
			System.out.println(qtyUnit1+" yards equal " +qtyUnit2 + " feet." );
		    break;
		case 9:
			System.out.println("The application is now closed.");
			break;
		default:
			System.out.println("Invalid option! Please re-enter the menu option.");
			break;
		}
        System.out.println();		
	  }
    keyboard.close();
  }
}

