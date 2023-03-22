package metodosOrdenacao;

//Bubble Sort
//Neste algoritmo cada elemento da posição i será comparado com o elemento da posição i + j.
//caso o elemento da posição 2 for maior que o da posição 3 eles trocam de lugar.

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = {2, 4, 3, 7, 8, 5, 4 }; // declarei um array chamado array com 7 inteiros 
		
		vetor = bubbleSort(vetor); // meu array recebe o metodo bubbleSort que manda como parametro ele msmo
		
		for(int i = 0; i< vetor.length; i++) { // laço for para visualização
			System.out.println(vetor[i]+"");
		}
	} // fim main 
	
	private static int[]bubbleSort(int vetor[]){
		
		for(int i = 0; i< vetor.length; i++) {
			for(int j = 1; j < vetor.length-i; j++) { 
				if(vetor[j-1] > vetor[j]) { // condição para executar a troca se vetor[j-1] > vetor[j] for true 
					
					int temp = vetor[j-1]; 
					vetor[j-1] = vetor[j];
					vetor[j] = temp; // realiza a troca 
				}
				
			}
		}
		return vetor; // retorna o vetor com a nova ordenação
			
	}
}
