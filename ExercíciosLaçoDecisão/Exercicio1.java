package Exercicio_dia_17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um número inteiro: ");
		n1=ler.nextInt();	
		System.out.println("\nEntre com um número inteiro: ");
		n2=ler.nextInt();
		System.out.println("\nEntre com um número inteiro: ");
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3) {		
			System.out.println("\nO número maior foi o primeiro digitado: "+n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("\nO número maior foi o segundo digitado: "+n2);
		}
		else {
			System.out.println("\nO número maior foi o terceiro digitado: "+n2);
		}
	}

}
