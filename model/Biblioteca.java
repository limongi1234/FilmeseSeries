package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
	private List <Programa> programas = new ArrayList<>();

	public Biblioteca(List <Programa> programas)
	{
		this.programas = programas;
	}

	public Biblioteca() 
	{

	}

	public Programa getPrograma(String nome) 
	{	

		for (Programa programa : programas) 
			if (programa.getNome().equals(nome)) 
				return programa;
			
		try 
		{
			checaPrograma(nome);
		}catch (Exception e) 
		{
			System.out.println("Ocorreu um problema: "+e.getMessage());
		}

		return null;
	}
	
	
	public void setProgramas(List <Programa> programas) 
	{
		this.programas = programas;
	}

	private void checaPrograma(String nome) throws ProgramaInexistenteException 
	{
		
		for (Programa programa : programas) 
			if(!programa.getNome().equals(nome)) 
				throw new ProgramaInexistenteException("Este programa não está cadastrado no sistema");
	}

	public List <Programa> getProgramas(ECategoria categoria)
	{
		ArrayList <Programa> temp = new ArrayList <> ();
		
		programas.forEach(programa ->
		{
			if (programa.getCategoria().equals(categoria)) 
				temp.add(programa);
			
		});
		
		return temp;
	}
}
