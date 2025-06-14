package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; // para que possa usar a classe

public class Program {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;  // pode fazer ctrl + shift + o para importar
		x = new Triangle();  // instanciando
		y = new Triangle();  // instanciando
		
		System.out.println("Enter the measure of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f %n", areaX);
		System.out.printf("Triangle Y area: %.4f %n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}		

		sc.close();
		
	}
}