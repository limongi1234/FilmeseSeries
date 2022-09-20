package model;

public interface IClassificar{
	public void classificar(int classificacao) throws ClassificacaoForaDoRangeException;
}
