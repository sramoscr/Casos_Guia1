package com.senati.clase2;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese un número: ");
		int num = sc.nextInt();
		
		int op;
		
		op = num * ( num + 1 )/2;
		
		System.out.println("---- RESULTADO ----");
		System.out.print("Sumatoria: "+op);

	}

}
