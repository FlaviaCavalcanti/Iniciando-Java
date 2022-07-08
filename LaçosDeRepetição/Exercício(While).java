package ExerciciosJava;

import java.util.Scanner;

public class ExercícioWhile {

	public static void main(String[] args) {
			double n1, soma = 0;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite um número");
			n1=ler.nextDouble();
			
			do {
				soma+=n1;				
				System.out.println("Digite um número");
				n1=ler.nextDouble();
				
				}while(n1!=0);
			System.out.println("A soma dos numeros digitados foi: "+soma);
	}

}
