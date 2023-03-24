package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//instanciando o trinagulo
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do Trinagulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do Trinagulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//chamando o metodo
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Triangulo x  %.2f%n", areax);
		System.out.printf("Triangulo y %.2f%n", areay);
		if(areax > areay) 
		{
			System.out.printf("Triangulo x maior %.2f%n", areax);
		}
		else 
		{
			System.out.printf("Triangulo y maior %.2f%n", areay);
		}

	}

}
