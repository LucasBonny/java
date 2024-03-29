package application;

import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY , pY, pX;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		pY = (y.a + y.b + y.c) / 2;
		pX = (x.a + x.b + x.c) / 2;
		areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		if(areaX > areaY) {
			System.out.println("X");
		}
		else {
			System.out.println("Y");
		}
		sc.close();
	}

}
