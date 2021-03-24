package com.senati.trabajog;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.0");
		
		System.out.println("Ingresa la nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Ingresa la nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Ingresa la nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio = nota1*0.20f + nota2*0.30f + nota3*0.50f;
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El promedio es: "+df.format(promedio));
		System.out.println("--------------------------");

	}

}
