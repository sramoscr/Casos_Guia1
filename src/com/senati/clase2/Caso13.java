package com.senati.clase2;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese su nombre...: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese su apellido.: ");
		String apellido = sc.nextLine();
		
		System.out.println("---- RESULTADO ----");
		System.out.print("Alumno: "+nombre+" "+apellido);
	}

}
