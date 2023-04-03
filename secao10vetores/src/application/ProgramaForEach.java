package application;

public class ProgramaForEach {
	public static void main(String[] args) {
		
		String[]vect = new String[] {"maria", "bob","Alex"};
		
		//percorrendo usando o for
		for(int i =0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("----------------------");
		//percorrendo com FOR EACH
		for(String nomes : vect) {
			System.out.println(nomes);
		}
		
	}
	
}
