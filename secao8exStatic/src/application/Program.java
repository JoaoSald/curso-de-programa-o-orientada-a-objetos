package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//	NA VERSÃO 2 -> Calculator calc = new Calculator();
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // calc.circumference(radius)
		double v = Calculator.volume(radius); // calc.volume(radius)
		
		System.out.printf("circumference: %.2f%n", c);
		System.out.printf("valume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
