package com.senati.trabajog;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el radio: ");
		float radio = sc.nextFloat();
		
		
		float p;
		
		
		p = (float) (Math.pow(radio, 2) *3.1416);
		
		System.out.println("---- Valores Ingresados ----");
		System.out.println("El área es......: "+p+" u²");
		

	}

}
