package com.senati.trabajog;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el número 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingrese el número 1: ");
		float n2 = sc.nextFloat();
		
		float prom=(n1+n2)/2;
		float prim=(n1*20/100)+n1;
		float segu=n2-(n2*30/100);
		
		System.out.println("----Resultados----");
		System.out.println("Promedio.........: "+ prom);
		System.out.println("Prim. aumentado..: "+ prim);
		System.out.println("Segu. disminuido.: "+ segu);
		
		
		
		
		

	}

}
