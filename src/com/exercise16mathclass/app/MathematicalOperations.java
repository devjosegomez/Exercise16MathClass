package com.exercise16mathclass.app;
import java.lang.Math;
public class MathematicalOperations 
{
	public static void main(String [] args) 
	{
		double number = 3.5;
		double number2 = 5.5;
		System.out.println("e value: " + Math.E);
		System.out.println("PI value: " + Math.PI);
		System.out.println("Absolute value of -2.15 is " + Math.abs(-2.15));
		System.out.println("The cube root of 27 is " + Math.cbrt(27));
		System.out.println("The round of 3.76 is " + Math.round(number));
		System.out.println("The ceil of 3.76 is " + Math.ceil(3.76));
		System.out.println("The floor of 3.76 is " + Math.floor(number));
		System.out.println(String.format("Which is bigger? %.2f or %.4f: %.3f ", number, number2, Math.max(number, number2)));
		System.out.println("Sin of 0 degrees is: " + Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: " + Math.sin(Math.PI/2));
	}
}
