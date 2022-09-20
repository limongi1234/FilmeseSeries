package model;

public class ProgramaInexistenteException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProgramaInexistenteException(String mensagem) {
		super(mensagem);
	}
}
