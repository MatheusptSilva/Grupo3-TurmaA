import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Jogo {

	static int temp_dialog = 50, temp_narrativa = 50, temp_transicao = 50;
	static int _acerto = 0;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		// System.out.print("
		// +------------------------------------------------------+");
		Escreve("\n                                                   *-----------* �SEJA BEM VINDO AO JOGO� *-----------* ",
				TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("\n                                                                     O �LTIMO DE N�S                    ",
				TimeUnit.MILLISECONDS, temp_dialog);
		// System.out.print("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n   ");
		Escreve("\n Voc� est� preparado para encarar o futuro... meu caro jogador?", TimeUnit.MILLISECONDS,
				temp_dialog);
		System.out.println("\n ");
		System.out.println(
				"\n 1|SIM, estou pronto!       2|Talvez, n�o sei o que me espera...           3|N�o, tenho medo!!!");
		int responder = entrada.nextInt();
		if (responder == 1) {
			Escreve("Muito bem... Muito bem... Vejamos s�, temos um corajoso por aqui! A grande matrix amar� enfrent�-lo HAHAHAH. Vejamos se � capaz de vencer um computador!!!!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 2) {
			Escreve("Ora, ora... Achei que era mais corajoso, pobre criatura... Est� ai, um grande motivo pelo qual os computadores s�o bem mais desenvolvidos e ultrapassaram a ra�a humana!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 3) {
			Escreve("Vejamos s� o que temos por aqui: o pior da peste humana! Chorar� e lamentar� no reinado das m�quinas, j� est� aqui verme... PROSSIGA!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		}

	}

	public static void Escreve(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int opcao_menu;
		do {
			Escreve("\n\n..::�  �O �LTIMO DE N�S�  �::.. \n\n1 - Jogar \n2 - Sobre o Jogo\n3 - Cr�ditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			opcao_menu = entrada.nextInt();
			if (opcao_menu == 1) {
				boolean ganhar = jogar();
				if (ganhar) {
					Escreve("\n P�rabens voc� ganhou o jogo!", TimeUnit.MILLISECONDS, temp_dialog);
				} else {
					Escreve("\n � meu chapa, n�o foi dessa vez que voc� ganhou!\n\n\n\n Deseja tentar de novo? S/N",
							TimeUnit.MILLISECONDS, temp_dialog);
					String jogar = entrada.next();
					if (jogar == "S") {
						menu();
					} else {
						Escreve("\n Ent�o at� uma pr�xima meu jovem!!!!", TimeUnit.MILLISECONDS, temp_dialog);
					}
				}
			} else if (opcao_menu == 2) {
				sobre();
				Escreve("O jogo se passa no ano de 2035 baseado no filme eu rob�, onde " +
								"o nosso personagem Will Smith, ap�s acordar de "
						+ " um coma induzido se depera com o dominio das maquinas sobre a humanidade."
						+ "\nNo jogo as perguntas s�o sobre a materia de conceitos da computa��o e " +
								"todas de alternativas, por tanto leia atentamente "
						+ "as perguntas e digite a resposta que desejar, por�m tome cuidade, pois voc� ter� chances limitadas.\n",
						TimeUnit.MILLISECONDS, temp_dialog);
			} else if (opcao_menu == 3) {
				creditos();
			} else if (opcao_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (opcao_menu != 1 && opcao_menu != 2 && opcao_menu != 3 && opcao_menu != 4);

		menu();
	}

	static boolean jogar() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int vidas = 3;
		boolean passou = false;
		Escreve("Bem-vindo ao futuro! Seu nome a partir de agora � Will... Boa sorte!\n\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// Atribuindo as perguntas, alternativas e o valor certo de resposta.
		String pergunta1 = "\n45 em bin�rio";
		List alternativas1 = Arrays.asList("101101", "010011", "111111", "000011", "110011");
		String certa1 = "101101";

		String pergunta2 = "\n10101 em Decimal ? ";
		List alternativas2 = Arrays.asList("24", "99", "25", "21", "15");
		String certa2 = "21";

		String pergunta3 = "\n58 em bin�rio ?";
		List alternativas3 = Arrays.asList("011111", "111011", "111010", "111001", "100000");
		String certa3 = "111010";

		String pergunta4 = "\nAF5 em octal ?";
		List alternativas4 = Arrays.asList("5.365", "5.000", "300", "6.000", "5.360");
		String certa4 = "5.365";

		String pergunta5 = "\nF17 em octal ?";
		List alternativas5 = Arrays.asList("7.00", "7.424", "7.017", "7.427", "7.217");
		String certa5 = "7.427";

		String pergunta6 = "\n7.000 octal em decimal ?";
		List alternativas6 = Arrays.asList("3.584", "3.583", "3.585", "3.000", "3.586");
		String certa6 = "3.584";
		
		String pergunta7 = "\nA seguinte express�o representa qual porta l�gica: S = A + B";
		List alternativas7 = Arrays.asList("Representesta soma", "Representa a condi��o or", "Representa a condi��o or", "Representa a condi��o and", "Representa a condi��o nor", "Representa a condi��o nand");
		String certa7 = "Representa a condi��o or";

		// mostra ao jogador a quantidade de vidas que ele ainda tem.
		mostrarVidas(vidas);

		// Pergunta 1
		Escreve("Locutor: Voc� acordou em uma cama de hospital, em quarto com pouca ilumina��o, sem janelas. \n"
				+ "Voc� est� com uma forte dor de cabe�a e sente que est� tudo girando ao seu redor. Voc� se esfor�a \n"
				+ "e consegue ent�o se levantar e se dirigir at� a porta. Ao chegar na porta e tentar abri-la, percebe que est� fechada \n"
				+ "Ap�s retormar um pouco de consci�ncia, ele come�a a recuperar os sentidos e a perceber melhor o ambiente. \n"
				+ "Ao olhar pelo quarto, ele v� ent�o um corpo totalmente decomposto sentado em uma cadeira e no seu colo o que \n"
				+ "seria uma carta dizendo: \n"
				+ " 'Para prosseguir, primeiramente para abrir a porta, voc� deve desbloquear todos os desafios\n"
				+ "Dessa forma, leve essa carta com voc� e nunca se esque�a: voc� � capaz de derrotar todas essas m�quinas!'\n\n ",
				TimeUnit.MILLISECONDS, temp_dialog);

		Escreve("Ap�s ler a carta, Will caminha at� a porta que possui um painel com uma pergunta para abri-l�: \n\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--Pergunta 1--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas1, pergunta1, certa1);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);
		passou = false;
		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);

		// Pergunta 2
		Escreve("Ap�s abrir a porta, Will se depara com um cen�rio arrasado, praticamente um cen�rio apocal�ptico. quase como se v� " +
						"nos filmes, ao fundo ele come�a a escutar sons de serragens, de soldas. Ainda atordoado de passar tanto tempo deitado e " +
						"internado e dar de cara com um homem morto. Will, diante de tudo isso, resolve se esconder por um tempo, para recobrar as " +
						"suas for�as. Ao recobrar a consci�ncia e ver melhor o mundo ao seu redor, Will decide n�o se precipitar e continuar escondido. " +
						"Resolve ent�o ver se na carta tinha mais alguma informa��o, ao olhar no verso da carta, ele encontra mais um trecho escrito:\n" +
						"\n" +
						"�Will, N�O TENHO MUITO TEMPO, Mas todas as respostas que voc� precisa, voc� vai encontrar em seu antigo laborat�rio. Quando " +
						"chegar l�, procure o local onde ficava o terceiro extintor perto da porta principal, l� voc� vai encontrar uma dica para a " +
						"nova senha do laborat�rio.�\n" +
						"Ele ent�o, vai se espreitando, andando pela escurid�o. Ao sair do ambiente onde ele estava, ele percebe que estava no pr�dio de " +
						"seu laborat�rio. Por�m estava no �ltimo andar de um pr�dio de 10 andares. Seu laborat�rio era no subsolo. Ele, como conhecia o " +
						"espa�o, foi em dire��o a um elevador que apenas ele conhecia, que era guardado por uma senha que ele n�o lembrava exatamente, " +
						"por�m como ele gostava de resolver problemas, ele deixou uma pergunta na parte de cima do teclado para acessar o elevador:\n\n"
																	,
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--Pergunta 2--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas2, pergunta2, certa2);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}
		mostrarVidas(vidas);
		passou = false;

		Escreve("O elevador ent�o chega em seu andar. Will sobe no elevador. Por�m, o seu laborat�rio era algo ao qual ele " +
						"n�o queria que as pessoas tivessem acesso ou at� mesmo que soubessem da exist�ncia dele. Por isso ele colocou no " +
						"painel do elevador, um local escondido. Neste local havia um novo painel, para que ele pudesse colocar um c�digo ao " +
						"qual liberasse o acesso ao andar do seu laborat�rio.\n" +
						"Neste painel, tinha mais uma dica sobre qual era o c�digo correto para chegar ao andar que ele queria. \n\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--:Pergunta 3:--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas3, pergunta3, certa3);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);
		passou = false;

		Escreve("Will chega no andar de seu laborat�rio, quando a porta do elevador abre, ele se depara com alguns corpos jogados " +
						"ao ch�o, todos j� em forma de esqueletos. Como se j� tivesse passado muito tempo desde a morte deles. Ao ver essa cena, " +
						"Will corre at� o seu laborat�rio, para ver se ele havia sido invadido. No entanto, a porta se mantinha intacta, o que foi " +
						"um alivio. Will ent�o tira a carta de seu bolso e l� o seu conte�do novamente, para descobrir onde estava a nova senha de " +
						"acesso ao laborat�rio. \n" +
						"�Quando chegar l�, procure o local onde ficava o terceiro extintor perto da porta principal, l� voc� vai encontrar uma " +
						"dica para a nova senha do laborat�rio.�\n" +
						"Ele foi at� o local indicado e pegou um outro peda�o de papel, onde tinha mais um pequeno desafio. Ele pegou o papel e " +
						"foi at� a porta, onde ele encontrou um painel manchado de sangue seco e com muitos corpos ao redor. Ele ent�o l� o desafio:\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		do {
			Escreve("--BLOCK DOOR--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas4, pergunta4, certa4);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);
		passou = false;

		Escreve("ACERTE O PR�XIMO DESAFIO E A PORTA SER� BLOQUEADA E JAMAIS O ACHAR�O! \n\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		do {
			Escreve("--BLOCK DOOR2 --", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas5, pergunta5, certa5);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);
		passou = false;

		Escreve("PORTA BLOQUEADA COM SUCESSO! \n\n", TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("Will volta-se para o computador, senta e come�a a buscar informa��es " +
						"na qual ele encontrara na carta deixada pelo morto eletrocutado"
				+ "Em um dos passos estava descrito que ele devia abrir um SOFTWARE chamado " +
						"'DISABLE MACHINES' Ao clicar, mais um desafio foi proposto \n"
				+ "Will notou que todos os acessos de administrador, de tudo ao seu redor, " +
						"tratavasse de desafios computacionais. Em um leve devaneio \n"
				+ "lembrou-se das sua �poca de faculdade... Mas de imediato recordou sua grande " +
						"miss�o de frente aquele computador, e come�ou a resolver: \n\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--DISABLE MACHINE--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas6, pergunta6, certa6);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);
		
		Escreve("Ap�s clicar no software e fazer tudo o que podia, abre-se uma porta, nela, h� diversos rob�s\n"
						+ "Nela h� mais um desafio\n"
						+ "Os rob�s afirmam que caso ele acerte a pr�xima pergunta, a Matrix toda ser� desabilitada, caso " +
						"contr�rio, o rob� poder� contraatacar.",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--DISABLE MACHINE--", TimeUnit.MILLISECONDS, temp_dialog);
			Boolean acertou = perguntas(alternativas7, pergunta7, certa7);
			if (acertou == false) {
				vidas--;
				mostrarVidas(vidas);
			} else {
				passou = true;
			}
		} while (passou != true && vidas != 0);

		if (vidas <= 0) {
			Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
			return false;
		}

		mostrarVidas(vidas);

		return true;
	}

	static void sobre() throws Exception {
		System.out.println("O jogo se passa no futuro, em uma realidade onde o mundo � dominado por uma inteligencia" +
				"artificial. Essa inteligencia artificial, ap�s entender e aprender com os humanos, ela passa ent�o " +
				"a entender e a pensar sozinha, de modo que ela chega a uma ideia de que os humanos s�o uma amea�a " +
				"para eles mesmos e tamb�m para o planeta Terra. Por esse motivo a inteligencia decide que a ra�a humana" +
				" era um mal que deveria ser combatido. De forma que ela passa a entrar dentro do software de f�bricas de robos " +
				"e passa a colocar a sua consciencia dentro deles. Depois que ela consegue criar o seu exercito de robos " +
				"sem que ningu�m percebesse, ela ataca os humanos e os subjulgam. Os poucos humanos que sobrevireram " +
				"se sujeitaram a viver escondidos em cavernas e em esconderijos que n�o tenham eletronicos que possam " +
				"ser conectados na rede.");
	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int opcao_menu, temp_narrativa = 150;
		System.out.println(
				"SENAC - SERVI�O NACIONAL DE APRENDIZAGEM COMERCIAL \nJogo elaborado para o PROJETO INTEGRADOR para a mat�ria de PI, no curso de AN�LISE E DESENVOLVIMENTO DE SISTEMAS! \nParticiparam ativamente da cria��o do jogo rpg textual(desenvolvedores):");

		Escreve("\n\n-> �Guilherme Alves \n-> �Vin�cius Santana \n-> �Matheus Thome \n-> �Gustavo Souza \n-> �Gustavo da Silva Oliveira",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n2 - Sair");
			opcao_menu = entrada.nextInt();
			if (opcao_menu == 2) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (opcao_menu != 2);
	}

	static void mostrarVidas(int vidasRestantes) {
		System.out.println("                                     +-------------------+");
		System.out.println("                                     |     VIDAS: " + vidasRestantes + "      |");
		System.out.println("                                     +-------------------+");
	}

	static boolean perguntas(List valores, String pergunta, String certa) throws Exception {
		Scanner entrada = new Scanner(System.in);
		boolean acertou = false;

		Collections.shuffle(valores);
		System.out.println(pergunta);
		System.out.println("a) " + valores.get(0));
		System.out.println("b) " + valores.get(1));
		System.out.println("c) " + valores.get(2));
		System.out.println("d) " + valores.get(3));
		System.out.println("e) " + valores.get(4));
		System.out.print("Escolha uma alternativa: ");
		String resposta = entrada.next();
		switch (resposta) {
		case "a":
		case "A":
			if (valores.get(0).equals(certa)) {
				System.out.println("Resposta correta!");
				acertou = true;
			} else {
				System.out.println("\nResposta incorreta!");
			}
			break;
		case "b":
		case "B":
			if (valores.get(1).equals(certa)) {
				System.out.println("Resposta correta!");
				acertou = true;
			} else {
				System.out.println("\nResposta incorreta!");

			}
			break;
		case "c":
		case "C":
			if (valores.get(2).equals(certa)) {
				System.out.println("Resposta correta!");
				acertou = true;
			} else {
				System.out.println("\nResposta incorreta!");

			}
			break;
		case "d":
		case "D":
			if (valores.get(3).equals(certa)) {
				System.out.println("Resposta correta!");
				acertou = true;
			} else {
				System.out.println("\nResposta incorreta!");

			}
			break;
		case "e":
		case "E":
			if (valores.get(4).equals(certa)) {
				System.out.println("Resposta correta!");
				acertou = true;
			} else {
				System.out.println("\nResposta incorreta!");
			}
			break;
		default:
			System.out.println("Escolha inv�lida!");
		}

		return acertou;
	}

}