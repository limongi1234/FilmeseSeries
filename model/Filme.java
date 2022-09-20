package model;

public final class Filme extends Programa {
   private double duracao;

	public double getDuracao() {
		return duracao;
	}

	public Filme(String nome, ECategoria categoria, double duracao) {
	   super(nome, categoria);
	
	   this.duracao = duracao;
	}
	
	public Filme(){
		super();
	}

	public void setDuracao(double duracao){
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Nome do programa: " + nome + "\nCategoria: " + categoria + "\nClassificação: " +pontuacao+"\nDuração do filme: "+duracao+" min\n"
				+ "---------------------\n";
	}
}
