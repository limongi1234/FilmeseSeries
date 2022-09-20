package model;
															
public abstract class Programa implements IClassificar {
	protected int pontuacao;
	protected String nome;
	protected ECategoria categoria;
	
	public Programa(String nome, ECategoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	public Programa(){
		super();
	}
	
	public Programa(String nome){
		this.nome = nome;
	}


	public int getPontuacao(){
		return pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ECategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ECategoria categoria){
		this.categoria = categoria;
	}

	@Override
	public void classificar(int classificacao) throws ClassificacaoForaDoRangeException{
		try {
			checarClassificacao(classificacao);
	    }catch (Exception e) {
		  System.out.println("Um problema ocorreu: "+e);
	    }
	}
	
	private void checarClassificacao(int classificacao) throws ClassificacaoForaDoRangeException {
		
		if(classificacao >= 0 && classificacao <= 5) 
			this.pontuacao = classificacao;
		else 
			throw new ClassificacaoForaDoRangeException
			("Classificação fornecida fora do range permitido (0 a 5 para filmes, 0 a 10 para séries)");
		
	}

	@Override
	public String toString() {
		return "Nome do programa: " + nome + "\tCategoria: " + categoria + "\tClassificação: " +pontuacao+"\n";
	}
}
