package Practica1;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ejemploThread ej;
		
		for (int i = 0; i < 100; i++) {
			ej = new ejemploThread();
			ej.start();
		}
		
		
	}

}
