package com.senati.clase1;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		float n1=0, n2=0;
		
		System.out.print("Primer número: ");
		n1=leer.nextFloat();
		
		System.out.print("Segundo número: ");
		n2=leer.nextFloat();
		
		System.out.println("---- Valores Ingresados ----");
		System.out.println("Número 1 es: "+n1);
		System.out.print("Número 2 es: "+n2);

	}

}
