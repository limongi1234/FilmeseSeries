package model;

public enum ECategoria 
{ 
	FANTASIA("Ficções, aventuras e tramas épicas"), TERROR("Suspenses psicológicos e trash horror"), COMEDIA("Pastelão e fim de noite");
	
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
