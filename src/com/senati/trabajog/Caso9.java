package com.senati.trabajog;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el ancho: ");
		float ancho = sc.nextFloat();
		
		System.out.print("Ingrese el largo: ");
		float largo = sc.nextFloat();
		
		float a,p;
		
		a = ancho*largo;
		p = 2*ancho + 2*largo;
		
		System.out.println("---- Valores Ingresados ----");
		System.out.println("El área es......: "+a+" u²");
		System.out.print("El perímetro es.: "+p+" u");
		

	}

}
