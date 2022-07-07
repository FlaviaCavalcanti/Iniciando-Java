package Exerciciodia1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	float n1,n2,n3;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("\nDigite um número: ");
	n1 = ler.nextFloat();
	System.out.println("\nDigite um número: ");
	n2 = ler.nextFloat();
	System.out.println("\nDigite um número: ");
	n3 = ler.nextFloat();
	
	if(n1<=n2 && n2<=n3)
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n1+", "+n2+", "+n3);
	}
	else if(n1<=n3 && n3<=n2 )
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n1+", "+n3+", "+n2);
	}
	else if(n2<=n3 && n3<=n1)
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n2+", "+n3+", "+n1);
	}
	else if(n2<=n1 && n1<=n3 )
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n2+", "+n1+", "+n3);
	}
	else if(n3<=n2 && n2<=n1 )
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n3+", "+n2+", "+n1);
	}
	else
	{
		System.out.print("\nOrdem Crescente dos numeros:"+n3+", "+n1+", "+n2);
	}
	
	
	}

}
