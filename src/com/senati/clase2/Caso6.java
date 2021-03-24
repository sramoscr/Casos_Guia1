package com.senati.clase2;

public class Caso6 {
	
	public static void main(String[] args) {
		// Él método "pow" del objeto "Math"permite hacer potencias.
		// Aplicar CAST: convertir un tipo de dato a otro.
		int res1 = (int) Math.pow(5, 3);
		
		float res2 = (float) Math.pow(81, 1/2.0);
		
		System.out.println("----Resultados----");
		System.out.println("Resultado 1....: "+ res1);
		System.out.println("Resultado 1....: "+ res2);
	}

}
