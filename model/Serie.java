package model;

import java.util.ArrayList;
import java.util.List;

public final class Serie extends Programa 
{
    private List <Temporada> temporadas = new ArrayList <Temporada> (); 
	
	public Serie(String nome, ECategoria categoria, List <Temporada> temporadas) 
	{
	    super(nome, categoria);
	    this.temporadas = temporadas;
	}

	public Serie()
	{
		super();
	}

    public List <Temporada> getQtdTemporadas() 
	{
		return temporadas;
	}
	
	public void setTemporadas(List <Temporada> temporadas) 
	{
		this.temporadas = temporadas;
	}

	@Override
	public void classificar(int classificacao) 
	{
		
		try 
		{
			checaClassificacao(classificacao);
		}catch (Exception e) 
		{
			System.out.println("Um problema ocorreu: "+ e);
		}
     }
	
	private void checaClassificacao(int classificacao) throws ClassificacaoForaDoRangeException 
	{
		if (classificacao >= 0 && classificacao <= 10) 
			this.pontuacao = classificacao;
		else 
			throw new ClassificacaoForaDoRangeException("Classificação fornecida fora do range permitido (0 a 5 para filmes, 0 a 10 para séries)");
	}
	
	@Override
	public String toString() 
	{
		return "Nome do programa: " + nome + "\nCategoria: " + categoria + "\nClassificação: " +pontuacao+"\n" + temporadas+"\n---------------------\n";
	}	
}
