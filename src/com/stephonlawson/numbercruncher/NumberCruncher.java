package com.stephonlawson.numbercruncher;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumberCruncher {

	private static Scanner input;

	public static void main(String[] args) {
		
		 input = new Scanner(System.in);

	        try {
	            double x = input.nextDouble();

	            String operation = input.next();
	            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")
	                    && !operation.equals("%") && !operation.equals("^"))
	                throw new IOException("\nYou entered wrong operation, please try again.");

	            double y = input.nextDouble();
	            if (operation.equals("/") && y==0)
	                throw new ArithmeticException("\nCannot divide by zero.");

	            double result = 0;

	            switch (operation) {
	                case "+":
	                    result = x + y;
	                    break;
	                case "-":
	                    result = x - y;
	                    break;
	                case "*":
	                    result = x * y;
	                    break;
	                case "/":
	                    result = x / y;
	                    break;
	                case "%":
	                    result = x % y;
	                    break;
	                case "^":
	                    result = Math.pow(x,y);
	                    break;
	            }
	
	            System.out.printf("\n%.2f %s %.2f = %.2f", x, operation, y, result);
	        }catch(IOException e){
	            System.out.println(e.getMessage());
	        }catch(InputMismatchException e){
	            System.out.println("Error!!!\nPlease enter a number.\nTry again.");
	        }catch(ArithmeticException e){
	            System.out.println (e.getMessage());
	        }catch(NoSuchElementException e){
	            System.out.println("Please try again.\nEnter first number, operations (+,-,*,/,% or ^) and second number with a space between them.");
	        }catch(Exception e){
	            System.out.println(e);
	        }

	            
	}

}
