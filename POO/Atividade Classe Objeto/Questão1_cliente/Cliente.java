package POO;

public class Cliente{
	private String nome;
	private int statusDeAtendimento;
	private int metodoDePagamento;
	
	public Cliente(String nome,int statusDeAtendimento,int metodoDePagamento) {
		this.nome=nome;
		this.statusDeAtendimento=statusDeAtendimento;
		this.metodoDePagamento=metodoDePagamento;
	}
	public void info() {
		System.out.println("Olá "+nome);
	}
	
	public void status()
	{
		if (statusDeAtendimento == 1) { 
			System.out.println("\nEspero que tenha gostado da experiência em nossa loja");
		}
		if (statusDeAtendimento == 2) {//Aguardando
			System.out.println("\nÉ um prazer ter você conosco, em breve será atendido");
		}
	}
	public void metododepag(){
		switch(metodoDePagamento) {
		case 1: //dinheiro
			System.out.println("\nO metodo escolhido \"Dinheiro\" obtém 15% de desconto");
			break;
		case 2: //pix
			System.out.println("\nO metodo escolhido \"Pix\" obtém 15% de desconto");
			break;
			default : System.out.println("\nApenas métodos de pagamento a vista obtém desconto");//cartão
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getStatusDeAtendimento() {
		return statusDeAtendimento;
	}
	public void setStatusDeAtendimento(int statusDeAtendimento) {
		this.statusDeAtendimento = statusDeAtendimento;
	}
	public int getMetodoDePagamento() {
		return metodoDePagamento;
	}
	public void setMetodoDePagamento(int metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	
	
	
}
