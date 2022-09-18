package model;

public class Temporada 
{
	private int qtdEp, numTemporada;
	
	public Temporada(int qtdEp, int numTemporada) 
	{
		this.qtdEp = qtdEp;
		this.numTemporada = numTemporada;
	}

	public Temporada()
	{
		super();
	}

	public int getQtdEp()
	{				
		return qtdEp;
	}

	public int getNumTemporada()
	{
		return numTemporada;
	}

	public void setQtdEp(int qtdEp) 
	{
		this.qtdEp = qtdEp;
	}

	public void setNumTemporada(int numTemporada)
	{
		this.numTemporada = numTemporada;
	}

	@Override
	public String toString()
	{
		return "Temporadas: " + numTemporada + "\nQuantidade de episódios por temporada: " + qtdEp;
	}
}
