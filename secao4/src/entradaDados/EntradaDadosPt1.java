package entradaDados;

import java.util.Scanner;

public class EntradaDadosPt1 {
public static void main(String[] args) {
			
	//Utilizando Scanner
	Scanner sc = new Scanner(System.in);
	String x;
	int a;
	
	//entrada e saida de string
	System.out.println("digite uma palavra:");
	x = sc.next();
	System.out.println("você digitou: " +  x);
	
	//entrada e saida de um inteiro
	System.out.println("digite um número:");
	a = sc.nextInt();
	System.out.println("você digitou: " +  a);
	
	// para outros tipos de variáveis segue o mesmo padrão 
	sc.close();
}
}
