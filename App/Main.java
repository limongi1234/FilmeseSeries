package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Biblioteca;
import model.ClassificacaoForaDoRangeException;
import model.ECategoria;
import model.Filme;
import model.Programa;
import model.Serie;
import model.Temporada;

public class Main
{
/**
 * @author Erick Ferraz Pereira, Paula Valviesse, Renato Lemos Limongi, Leonardo Gomes Serafim, Gustavo Alberto Kozlowiski,
 *  Jo�o Luiz Costa, Pedro Salvador Mendes.
 *  
 * @param args
 */
	public static void main(String[] args)
	{

		List <Programa> listaPrograma = new ArrayList <Programa>();
		List <Temporada> listaTemporada = new ArrayList <Temporada>();
		
		Filme filme;
		Serie serie;
		
		Temporada temporada;
		Biblioteca biblioteca = new Biblioteca();
		
		int op = 0, opt = 0, cat = 0;
		
		boolean sair = false;
		
		String nome = "";
		
		Scanner leia = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		do 
		{
			try 
			{
				System.out.println("-------- MENU DE OP��ES --------");
				System.out.println("1. Cadastrar programa\n2. Editar programa\n3. Remover programa"
						+ "\n4. Classificar programa\n5. Listar por categoria\n6. Sair");
				System.out.println("\nDigite sua op��o aqui: ");
				op = leia.nextInt();

				switch (op) 
				{
				    case 1:
					System.out.println(
							"\nEscolha o tipo de programa deseja cadastrar: \n1) Filme\n2) S�rie\n\nDigite aqui sua op��o: ");
					opt = leia.nextInt();

					if (opt == 1) 
					{
						filme = new Filme();

						System.out.println("\nInforme o nome do filme: ");
						nome = scan.nextLine();
						filme.setNome(nome);

						System.out.println();
						System.out.println(
								"Informe a categoria: \n1) Com�dia\n2) Fantasia\n3) Terror\n\nDigite aqui sua op��o: ");
						cat = leia.nextInt();

						if (cat == 1) 
							filme.setCategoria(ECategoria.COMEDIA);
						 else if (cat == 2) 
							filme.setCategoria(ECategoria.FANTASIA);
						else if (cat == 3) 
							filme.setCategoria(ECategoria.TERROR);
						else
						{
							System.out.println("ERRO! Categoria inv�lida. Pressione uma tecla para voltar: ");
							leia.next();
							break;
						}
						
						System.out.println();
						System.out.println("Informe a dura��o do filme em minutos: ");
						
						filme.setDuracao(leia.nextInt());
						System.out.println();

						listaPrograma.add(filme);
						biblioteca.setProgramas(listaPrograma);
						
						System.out.println("Filme cadastrado com sucesso!\nPressione qualquer tecla para voltar: ");
						leia.next();
						break; 

					} else if (opt == 2)
					{
						serie = new Serie();
						temporada = new Temporada();

						System.out.println("Informe o nome da s�rie: ");
						nome = scan.nextLine();
						serie.setNome(nome);

						System.out.println();
						System.out.println(
								"Informe a categoria: \n1) Com�dia\n2) Fantasia\n3) Terror\n\nDigite aqui sua op��o: ");
						cat = leia.nextInt();

						if (cat == 1) 
							serie.setCategoria(ECategoria.COMEDIA);
						else if (cat == 2) 
							serie.setCategoria(ECategoria.FANTASIA);
						 else if (cat == 3) 
							serie.setCategoria(ECategoria.TERROR);
						 else 
						 {
							System.out.println("ERRO! Categoria inv�lida. Pressione qualquer tecla para voltar: ");
							leia.next();
							break;
						 }
						
						 System.out.println();
						 System.out.println("Informe a quantidade de temporadas: ");
						 temporada.setNumTemporada(leia.nextInt());

						 System.out.println();
						 System.out.println("Informe a quantidade de epis�dios: ");
						 temporada.setQtdEp(leia.nextInt());
						 System.out.println();

						 listaTemporada.add(temporada);
						 serie.setTemporadas(listaTemporada);
						 listaPrograma.add(serie);
						 biblioteca.setProgramas(listaPrograma);
						 System.out.println("S�rie cadastrada com sucesso! Pressione qualquer tecla para voltar: ");
						 leia.next();
						 break; 
					 } else 
					 {
						System.out.println("ERRO! Digite uma op��o v�lida. Pressione qualquer tecla para voltar: ");
						leia.next();
						break;
					}
					
				    case 2:
					System.out.println("\nInforme o nome do programa que deseja editar: ");
					nome = scan.nextLine();

					if (listaPrograma.isEmpty())
					{
						System.out.println(
								"Imposs�vel editar programas de uma lista vazia! Pressione uma tecla para voltar: ");
						leia.next();
						break;
					}
					
					for (Programa programa : listaPrograma) 
					{
						if (programa.getNome().equalsIgnoreCase(nome))
						{
							System.out.println("\nPrograma: " + programa.getNome());
							System.out.println("\n1) Editar nome\n2) Editar categoria\n\nDigite aqui sua op��o: ");
							opt = leia.nextInt();

							if (opt == 1) 
							{
								System.out.println("\nInforme o novo nome do programa: ");
								programa.setNome(scan.nextLine());
								System.out
										.println("\nAltera��o efetuada com sucesso! Pressione uma tecla para voltar: ");
								leia.next();
								break;
							} else if (opt == 2)
							{
								System.out.println("\nInforme a nova categoria do programa: "
										+ " \n1) Com�dia\n2) Fantasia\n3) Terror\n\nDigite aqui sua op��o: ");
								opt = leia.nextInt();

								if (opt == 1) 
								{
									programa.setCategoria(ECategoria.COMEDIA);
									System.out.println(
											"Altera��o efetuada com sucesso! Pressione uma tecla para voltar: ");
									leia.next();
									break;
								} else if (opt == 2) 
								{
									programa.setCategoria(ECategoria.FANTASIA);
									System.out.println(
											"Altera��o efetuada com sucesso! Pressione uma tecla para voltar: ");
									leia.next();
									break;
								} else if (opt == 3)
								{
									programa.setCategoria(ECategoria.TERROR);
									System.out.println(
											"Altera��o efetuada com sucesso! Pressione uma tecla para voltar: ");
									leia.next();
									break;
								} else
								{
									System.out.println("ERRO! Categoria inv�lida. Pressione uma tecla para voltar: ");
									leia.next();
									break;
								}
							} else 
							{
								System.out.println("ERRO! Digite uma op��o v�lida. Pressione uma tecla para voltar: ");
								leia.next();
								break;
							}
						} else 
						{ 
							System.out.println(
									"Esse programa n�o se encontra cadastrado na biblioteca. Pressione uma tecla para voltar: ");
							leia.next();
							break;
						}
					}
					break;
					
				    case 3:
					System.out.println("\nInforme o nome do programa que deseja excluir: ");
					nome = scan.nextLine();
					
					if (listaPrograma.isEmpty()) 
					{
						System.out.println(
								"Imposs�vel remover programas de uma lista vazia! Pressione uma tecla para voltar: ");
						leia.next();
						break;
					}
					
					for (Programa programa : listaPrograma)
					{
						if (programa.getNome().equalsIgnoreCase(nome))
						{
							System.out.println("Deseja realmente excluir " + programa.getNome()
									+ "?\n1) Sim\n2) N�o\n\nDigite aqui sua op��o: ");
							opt = leia.nextInt();
							if (opt == 1) 
							{
								listaPrograma.remove(programa);
								System.out.println("Programa exclu�do com sucesso! Pressione uma tecla para voltar: ");
								leia.next();
								break;
							} else if (opt == 2) 
							{
								System.out
										.println(programa.getNome() + " � um �timo programa. Que bom que n�o removeu. "
												+ "Pressione uma tecla para voltar: ");
								leia.next();
								break;
							} else
							{
								System.out.println("ERRO! Escolha uma op��o v�lida. Pressione uma tecla para voltar: ");
								leia.next();
								break;
							}
						} else 
						{ 
							System.out.println(
									"Esse programa n�o se encontra cadastrado na bibilioteca. Pressione uma tecla para voltar: ");
							leia.next();
							break;
						}
					}
					break;
				    
				    case 4:
					boolean achouPrograma = false;
					System.out.println("\nInforme o nome do programa que deseja classificar: ");
					nome = scan.nextLine();

					for (Programa programa : listaPrograma)
					{
						if (programa.getNome().equalsIgnoreCase(nome)) 
						{
							achouPrograma = true;
							System.out.println("\nInforme sua nota para " + programa.getNome() + ": ");
							try
							{
								programa.classificar(leia.nextInt());
								System.out.println(
										"\nPrograma classificado com sucesso! Pressione uma tecla para voltar: ");
							} catch (ClassificacaoForaDoRangeException cfdre) 
							{
								System.out.println("Um problema ocorreu: " + cfdre);
								System.out.println("Pressione uma tecla para voltar: ");
							}
							leia.next();
							break;    
						}
					}
					
					if (!achouPrograma) 
					{
						System.out.println(
								"Esse programa n�o se encontra cadastrado na biblioteca. Pressione uma tecla para voltar: ");
						leia.next();
						break;
					}
					break;
				    
				    case 5:
					System.out.println(
							"\nSelecione a categoria a qual deseja listar os programas:\n1) Com�dia\n2) Fantasia\n3) Terror\n\n"
									+ "Digite aqui sua op��o: ");
					opt = leia.nextInt();

					if (opt == 1) 
					{
						System.out.println(
								"\n----------------------------------\nListagem dos programas de COM�DIA\n------------"
										+ "----------------------\n\n");
						for (Programa programa : listaPrograma) 
							if (programa.getCategoria() == ECategoria.COMEDIA) 
								System.out.println(programa.getNome());
							
						
						System.out.println("\nPressione uma tecla para voltar: ");
						leia.next();
						break;
					} else if (opt == 2) 
					{
						System.out.println(
								"\n----------------------------------\nListagem dos programas de FANTASIA\n---------------"
										+ "-------------------\n\n");
						for (Programa programa : listaPrograma) 
							if (programa.getCategoria() == ECategoria.FANTASIA) 
								System.out.println(programa.getNome());
							
						
						System.out.println("\nPressione uma tecla para voltar: ");
						leia.next();
						break;
					} else if (opt == 3)
					{
						System.out.println(
								"\n----------------------------------\nListagem dos programas de TERROR\n----------------"
										+ "------------------\n\n");
						for (Programa programa : listaPrograma) 
						
							if (programa.getCategoria() == ECategoria.TERROR) 
								System.out.println(programa.getNome());
							
						
						
						System.out.println("\nPressione uma tecla para voltar: ");
						leia.next();
						break;
					} else
					{
						System.out.println("ERRO! Informe uma categoria v�lida. Pressione uma tecla para voltar: ");
						leia.next();
						break;
					}

				    case 6:
					System.out.println("\n\"� preciso que o disc�pulo da sabedoria tenha o cora��o grande e corajoso. "
							+ "O fardo � pesado e a viagem longa.\" - Conf�gura��o.\n\nEncerrando o programa. At� mais!");
					sair = true;
				}
			} catch (InputMismatchException ime) 
			{
				System.out.println(
						"ERRO: Escolha uma op��o v�lida ou insira um valor num�rico v�lido! Pressione uma tecla para voltar: ");
				leia.next();
				leia.next();
			}
		} while (!sair);
		leia.close();
		scan.close();
	}
}
