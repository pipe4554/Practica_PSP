package Practica1;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ejemploThread ej;
		
		for (int i = 0; i < 100; i++) {
			ej = new ejemploThread();
			ej.start();
		}
		
		
	}

}
