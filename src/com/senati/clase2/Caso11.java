package com.senati.clase2;
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("----Resultados----");
		System.out.println("Cantidad de caracteres: "+ nombre.length());

	}

}
