package POO;

import java.util.Scanner;

public class testeCliente {

	public static void main(String[] args) {
		String nome1;
		int dindin;
		int status;
		Scanner ler = new Scanner(System.in);
		
		Cliente cliente1= new Cliente("Flavia",1,2);
		
		System.out.println("Qual o seu nome?");
		nome1=ler.nextLine();
		cliente1.setNome(nome1);
		
		
		System.out.print("\nDigite \"1\" para dinheiro");
		System.out.print("\nDigite \"2\" para Pix");
		System.out.print("\nDigite \"3\" para cartão");
		System.out.println("\nQual o seu metodo de pagamento?");
		dindin=ler.nextInt();
			while(dindin !=1 && dindin != 2 && dindin != 3) {
				System.out.println("\nNúmero digitado inválido, Digite 1, 2 ou 3...");
				System.out.print("\nDigite \"1\" para dinheiro");
				System.out.print("\nDigite \"2\" para Pix");
				System.out.print("\nDigite \"3\" para cartão");
				System.out.println("\nQual o seu metodo de pagamento?");
				dindin=ler.nextInt();
			}
		cliente1.setMetodoDePagamento(dindin);
		System.out.println("Voce já foi atendido?");
		System.out.println("Digite \"1\" para sim ou \"2\" para não");
		status = ler.nextInt();
			while(status!=1 && status !=2) {
				System.out.println("\nNúmero digitado inválido, Digite 1 ou 2...");
				System.out.println("\nVoce já foi atendido?");
				System.out.println("\nDigite \"1\" para sim ou \"2\" para não");
				status = ler.nextInt();
			}
		cliente1.setStatusDeAtendimento(status);
		
		System.out.println("----------------------------------------");
		cliente1.info();
		cliente1.status();
		cliente1.metododepag();
		System.out.println("----------------------------------------");
	}

}
