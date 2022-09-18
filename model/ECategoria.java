package model;

public enum ECategoria 
{ 
	FANTASIA("Fic��es, aventuras e tramas �picas"), TERROR("Suspenses psicol�gicos e trash horror"), COMEDIA("Pastel�o e fim de noite");
	
	private final String descricao;
	
	private ECategoria (String descricao) 
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}
}
