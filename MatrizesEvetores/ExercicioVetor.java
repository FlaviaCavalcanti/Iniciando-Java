package ExerciciosJava;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		float nota,n=0;
		float vetor[]=new float[5];
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{
			System.out.println("Escreva sua pontuação da atividade: ");
			nota = leia.nextFloat();
				if(nota>n) 
				{
					n=nota;
				}
			
		}
		System.out.println("A maior pontuação foi:"+n);

	}

}
