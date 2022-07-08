package ExerciciosJava;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		  int id,jovem=0,velho=0;
		 Scanner ler=new Scanner(System.in);
		
		 System.out.println("Digite -99, para sair do loop");
		 System.out.println("Digite sua idade: ");
		 id = ler.nextInt();
		 
		 while(id!=-99) 
		 {
			 System.out.println("Digite sua idade: ");
			 id = ler.nextInt();
			 if(id <=21)
			 {
				 jovem++;
			 }
			 else if(id>=50) {
				 velho++;
				 
			 }
		 }
		 System.out.println("\nPessoas com idade maior que 50 anos: "+velho);
		 System.out.println("\nPessoas com idade menor que 21: "+jovem);

	}

}
