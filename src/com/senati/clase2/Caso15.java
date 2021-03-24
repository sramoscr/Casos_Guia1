package com.senati.clase2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingrese la cantidad : ");
		int cant = sc.nextInt();
		
		System.out.print("Ingrese el precio   : ");
		float pre = sc.nextFloat();
		
		float imp = cant * pre;
		
		float dol = imp /(float) 3.24;
		
		float eur = imp /(float) 3.75;
		
		
		System.out.println("-------------------");
		System.out.println("--- RESULTADOS ----");
		System.out.println("-------------------");
		System.out.println("El importe es..........: "+df.format(imp)+" soles");
		System.out.println("El importe en dolares..: "+df.format(dol)+" $");
		System.out.println("El importe en euros....: "+df.format(eur)+" €");

	}

}
