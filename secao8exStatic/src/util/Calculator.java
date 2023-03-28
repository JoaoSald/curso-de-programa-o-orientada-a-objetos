package util;

public class Calculator {
	public static final double PI = 3.12159;
	// NA VERSAO 2 -> public  final double PI = 3.12159;
	
	
	public static double circumference(double radius) {
	// NA VERSAO 2 -> public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		// NA VERSAO 2 -> public double volume(double radius) {
		return 4.0 * PI* radius * radius / 3.0;
	}
}
