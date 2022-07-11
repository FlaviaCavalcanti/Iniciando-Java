package Exercicios;

import java.util.Scanner;

public class ExercicioMatrizes2 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3], soma=0,soma1=0,l,c;
		Scanner ler = new Scanner(System.in);
		
		for(l=0;l<3;l++) 
		{
			for (c=0;c<3;c++)
			{
				System.out.println("Escreva um valor: ");
				matriz[l][c]=ler.nextInt();
				soma= soma+matriz[l][c];
			}
		}
		System.out.println(" A soma dos valores da matriz: "+soma);
		
		for (int x=0;x<3;x++) {
			soma1 = soma1 + matriz[x][x];
			
		}
		System.out.println(" A soma dos valores da diagonal  da matriz: "+soma1);
		
	}

}
