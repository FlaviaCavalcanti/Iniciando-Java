package POO;

public class aviao {
	private String cor;
	private String quantidadeDePassageiros;
	
	public aviao(String cor, String quantidadeDePassageiro) {
		this.cor = cor;
		this.quantidadeDePassageiros = quantidadeDePassageiro;
	}
	public void info() {
		System.out.println("O avião tem a cor: "+cor+", e suporta até "+quantidadeDePassageiros+" passageiros.");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}
	public void setQuantidadeDePassageiros(String quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
	
}
