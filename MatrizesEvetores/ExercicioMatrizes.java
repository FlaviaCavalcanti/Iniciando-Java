package Exercicios;

import java.util.Scanner;

public class ExercicioMatrizes {

	public static void main(String[] args) {
		int n1[][]= new int [2][3], n2[][]= new int [2][3],l,c;
		int m1[][]= new int [2][3], m2[][]= new int [2][3];
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++) 
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Escreva um valor para n1: ");
				n1[l][c]=leia.nextInt();
				System.out.println("Escreva um valor para n2: ");
				n2[l][c]=leia.nextInt();
				
				m1[l][c]=n1[l][c]+n2[l][c];
				m2[l][c]=n1[l][c]-n2[l][c];
			}
		}
		
		for (l=0;l<2;l++) 
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Os valores de m1: "+m1[l][c]);
			}
		}
		System.out.println("\n____________________________________________________\n");
		for (l=0;l<2;l++) 
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Os valores de m2: "+m2[l][c]);
			}
		}
	}

}
