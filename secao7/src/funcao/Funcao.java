package funcao;

import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);  // invoca fun��o e passa 3 parametros do teclado
		showResult(higher); // invoca fun��o
		sc.close();
		}
		//primeira fun��o
		public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
		aux = x;
		} else if (y > z) {
		aux = y;
		} else {
		aux = z;
		}
		return aux;
		}
		//segunda f��o
		public static void showResult(int value) {
		System.out.println("Higher = " + value);
		}

}
