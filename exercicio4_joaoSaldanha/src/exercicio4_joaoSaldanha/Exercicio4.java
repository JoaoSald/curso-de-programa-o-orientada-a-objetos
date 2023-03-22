package exercicio4_joaoSaldanha;

import java.util.Scanner;


public class Exercicio4 {
	
	//Escreva um método que recebe um array de inteiros e devolve a posição onde se encontra o maior
	//valor do array. Se houver mais de um valor maior, devolver a posição da primeira ocorrência. O
	//método deve ter a seguinte assinatura:
	//public int retornaPosicaoMaiorElemento(int[] vetor) {
	//...
	//} 
	
	public static void main(String[] args) {
        
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		int numeros [] = new int [10];
		System.out.println("digite os numeros para o array: ");
		for(int i =0; i < numeros.length; i++) 
		{
			numeros[i] = sc.nextInt();
		}
		
		int result = retornaPosicaoMaiorElemento(numeros);
		System.out.println("A posição do maior número é: " + result);
		
	}//fim main 
	
 public static int retornaPosicaoMaiorElemento(int[] vetor) {
    int maior=0;
    
	 for(int i =0 ; i < vetor.length; i++) {
			if(vetor[i] > vetor[maior]) {
				maior = i;
			}
			
		}
		return maior;
		} 
}
