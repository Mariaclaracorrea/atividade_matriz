package atividade_matriz;

import java.util.Scanner;

public class Atividade02 {
	
	public static void main(String[] args) {
		
		int pares[][] = new int [5][5];
		
		// Entrada de dados 
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				pares[i][j] = (int)Math.round(Math.random()*100);
				
			}
		}
		 // Saída de dados
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(pares[i][j] % 2==0) {
				System.out.println("valor inteiros dos pares são: " + pares[i][j]);
				}
			}
		}
		
		
	}

}
