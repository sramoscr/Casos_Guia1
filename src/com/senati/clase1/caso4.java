package com.senati.clase1;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		float n1=0, n2=0;
		
		System.out.print("Primer número: ");
		n1=leer.nextFloat();
		
		System.out.print("Segundo número: ");
		n2=leer.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		
		System.out.println("---- Valores Ingresados ----");
		System.out.println("Suma: "+ suma);
		System.out.print("Resta: "+ resta);

	}

}
