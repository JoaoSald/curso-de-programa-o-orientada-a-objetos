package entradaDados;

import java.util.Scanner;

public class EntradaDadospt2 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String s1, s2, s3;
	int x;
	
	System.out.println("digite um número e em seguida 3 palavras: ");
	x = sc.nextInt();
	sc.nextLine(); // resolve a quebra de linha que é absorvida pelo nextLine
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	System.out.println("dados recebidos: ");
	System.out.println(x);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	sc.close();
}
}
