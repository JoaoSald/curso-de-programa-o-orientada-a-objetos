package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//instanciando a lista e para isso usamos ArrayList,pois ela é uma calsse q implementa a interface
				List<String> list = new ArrayList<>();
				
		//adicionando valores a esta lista 
				list.add("Maria");
				list.add("Alex");
				list.add("Bob");
				list.add("Anna");
				
		//adicionando um valor numa posição específica 
				list.add(2, "Marco");
				
		// removendo um valor da lista
//			list.remove("Anna");
		//ou
			//list.remove(1);
		// removendo pessoas que começam com a letra M a partir do predicado 
			//list.removeIf(x -> x.charAt(0) == 'M');
		//tamanho da lista 
				System.out.println(list.size());
				
		// percorrendo a lista com forEach
				for(String x : list) {
					System.out.println(x);
				}
				System.out.println("------------------");
				list.removeIf(x -> x.charAt(0) == 'M');
				for(String x : list) {
					System.out.println(x);
				}
				System.out.println("------------------");
				//Consultando a posição de um valor
				System.out.println("Index of BoB: "+ list.indexOf("Bob"));
				System.out.println("Index of BoB: "+ list.indexOf("Marco"));
				System.out.println("------------------");
				
				//Imprimindo somente as pessoas que tem começam com A 
				List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
				for(String x : result) {
					System.out.println(x);
				}
				System.out.println("---------------------");
				//imprimindo o primeiro valor com A
				String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
				System.out.println(name);
			}
}
