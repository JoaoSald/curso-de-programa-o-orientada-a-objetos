package exercicio2_joaoSaldanha;

import java.util.Scanner;

public class Exercicio2 {
//Crie um método que recebe um array de inteiros e um valor inteiro e retorna a quantidade de vezes
	//que este valor aparece no array. O método deve ter a seguinte assinatura:
		//public int contaOcorrenciasValor(int[] vetor, int valor) {
		//...
		//} 
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int x;
	System.out.println("digite um numero qualquer");
	x = sc.nextInt();
	
	int numeros[] = new int [10];
	System.out.println("Digite 10 numeros para completar o array: ");
	
	for(int i =0; i < numeros.length; i++)
	{
		numeros[i] = sc.nextInt();
	}	
	
	int result = contaOcorrenciasValor(numeros, x);
	System.out.println("o numero x se repete: "+ result + " vezes no array.");
}//fim main

public static int contaOcorrenciasValor(int[] vetor, int valor) {
	int count= 0;
	for(int i = 0; i <vetor.length; i++) 
	{
			if(vetor[i] == valor)
			{
			count ++;
			}
    }
	return count;
	
  }//fim contaOcorrenciasValor
}


