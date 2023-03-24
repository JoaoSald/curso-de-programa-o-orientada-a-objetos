package entities;

public class Triangle {
	
		//passando atributos
		public double a;
		public double b;
		public double c;
		
		
		//criando o metodo
		public double area() {
		double p = (a+ b+ c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
