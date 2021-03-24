package com.senati.trabajog;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingrese las horas trabajadas..: ");
		int h = sc.nextInt();
		
		System.out.print("Ingrese su tarifa por hora....: ");
		float t = sc.nextFloat();
		
		float s = h * t;
		float b = s * 5/100;
		float to = b + s;
		float d = to / (float) 3.24 ;
		
		System.out.println("---- RESULTADOS ----");
		System.out.println("--------------------");
		System.out.println("Sueldo........: s/"+df.format(s));
		System.out.println("Bono..........: s/"+df.format(b));
		System.out.println("Total.........: s/"+df.format(to));
		System.out.println("Total dolares.: $ "+df.format(d));
	}

}
