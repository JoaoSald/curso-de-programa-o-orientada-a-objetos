package estruturaWhile;

import java.util.Scanner;
public class While{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		@SuppressWarnings("unused")
		int soma = 0;
		
		while(x!=0) {
			soma +=x; // soma = soma + x
		    x = sc.nextInt();
		
		}
		sc.close();
		System.out.println(soma);
	}

}
