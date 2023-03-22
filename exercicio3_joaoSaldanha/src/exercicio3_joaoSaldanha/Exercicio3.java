package exercicio3_joaoSaldanha;

import java.util.Scanner;

public class Exercicio3 {
	
	private static boolean teste = false;

	//Crie um método que verifica se o array contém elementos distintos. Deve retornar true, caso
	//contenha elementos distintos, e false caso contrário. O método deve ter a seguinte assinatura:
	//public boolean temElementosDistintos(int[] vetor) {
	//...
	//} 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros [] = new int [10];
		
		System.out.println("digite os numeros para o array: ");
		for(int i =0; i < numeros.length; i++) 
		{
			numeros[i] = sc.nextInt();
		}
	
		boolean result = temElementosDistintos(numeros);
		System.out.println(result);
	} // fim main
	
	public static boolean temElementosDistintos(int[] vetor) {
		for(int i = 0; i< vetor.length; i++) {
			int aux = 1;
			
			if(vetor[i] != vetor[aux]) 
			{
			 teste = true;
			} 
		}
		return teste;
		
} 
	
}
