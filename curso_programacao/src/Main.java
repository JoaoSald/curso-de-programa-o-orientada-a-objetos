import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	int y = 32;
	double x = 10.5356677;
	//System.out.println(y);
	System.out.println(x);
	System.out.printf("%.2f%n", x); 
	Locale.setDefault(Locale.US);
	System.out.printf("%.2f%n", x);  
	System.out.println("RESULTADO:" + x + " METROS");  

	}

}
