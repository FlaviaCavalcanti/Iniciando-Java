package Exercicios;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		int dado[]=new int [3],soma=0,media=0,m6=0,m5=0,m3=0,m4=0,m2=0,m1=0;
		Scanner leia = new Scanner (System.in);
		
		for(int x=0;x<3;x++)
		{
			System.out.println("Digite um valor entre 1 e 6 : ");
			dado[x]=leia.nextInt();	
				while(dado[x]<1 || dado[x]>6)
				{	
					System.out.println("Valor inválido, digite novamente.");
					System.out.println("Digite um valor entre 1 e 6 : ");
					dado[x]=leia.nextInt();	
				}
			soma+=dado[x];
			media=soma/3;
			
		if(dado[x]==6)
		{
			m6++;
		}
		else if(dado[x]==5)
		{
			m5++;
		}
		else if(dado[x]==4)
		{
			m4++;
		}
		else if(dado[x]==3)
		{
			m3++;
		}
		else if(dado[x]==2)
		{
			m2++;
		}
		else if(dado[x]==1)
		{
			m1++;
		}	
		
		}
			System.out.println("\n");
			System.out.println("---------------------------------------------------------------");
			if(m6>m5 && m6>m4 && m6>m3 && m6>m2 && m6>m1) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"6\": " +m6+" vezes");
			}
			if(m5>m6 && m5>m4 && m5>m3 && m5>m2 && m5>m1) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"5\": " +m5+" vezes");
			}
			if(m4>m6 && m4>m5 && m4>m3 && m4>m2 && m4>m1) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"4\": " +m4+ " vezes");
			
			}
			if(m3>m6 && m3>m5 && m3>m4 && m3>m2 && m3>m1) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"3\": " +m3+ " vezes");
			}
			if(m2>m6 && m2>m5 && m2>m4 && m2>m3 && m2>m1) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"2\": " +m2+ " vezes");
			}
			if(m1>m6 && m1>m5 && m1>m4 && m1>m2 && m1>m3) 
			{
			System.out.println("A numeração que saiu mais vezes foi \"1\": " +m1+ " vezes");
			}
			
			
			
			System.out.println("A média aritmética dos valores foi: "+media);
			
		
			if(m6!=0)
			{
				System.out.println("O maior número que saiu foi o \"6\":"+ m6+ " vez(es)");
			}
			else if (m6 == 0  && m5 != 0) 
				{
				System.out.println("O maior número que saiu foi o \"5\" :"+ m5+ " vez(es)");
				}
			else if(m5==0 && m4!=0) {
				System.out.println("O maior número que saiu foi o \"4\" :"+ m4+ " vez(es)");
			}
			else if (m4==0 && m3!=0) {
				System.out.println("O maior número que saiu foi o \"3\" :"+ m3+ " vez(es)");
			}
			else if (m3==0 && m2!=0) {
				System.out.println("O maior número que saiu foi o \"2\" :"+ m2+ " vez(es)");
			}
			else if (m2==0 && m1!=0) {
				System.out.println("O maior número que saiu foi o \"3\" :"+ m1+ " vez(es)");
			}
		System.out.println("A soma dos números que sairam foi: "+soma);
		System.out.println("---------------------------------------------------------------");
	}

}
