import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Jogo {

	static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;
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
				Escreve("O jogo se passa no ano de 2035 baseado no filme eu rob�, onde o nosso personagem Will Smith, ap�s acordar de "
						+ " um coma induzido se depera com o dominio das maquinas sobre a humanidade."
						+ "\nNo jogo as perguntas s�o sobre a materia de conceitos da computa��o e todas de alternativas, por tanto leia atentamente "
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
		Escreve("Ap�s abrir a porta, Will se depara com um mundo todo automatizado. Uma grande sala repleta de robos monitorano telas. \n"
				+ "Com um grande temor, Will sente-se paralisado e resolve pegar a carta que encontrou anteriormente para l�-la novamente. \n "
				+ "Em certa parte da carta diz o seguinte: '...Se elas te pegarem, te levar�o para uma grande sala l� para onde todos n�s \n "
				+ "fomos levados se voc� estiver lendo, lembre-se sempre que �s o �ltimo de n�s. O futuro da humanidade depende de voc�...'. \n"
				+ "Enquanto estava lendo na frente daquela porta aberta, Will ouve um grande barulho de alarme e nota de longe todos os rob�s \n"
				+ "correndo. Desesperado, ele corre para uma sala � frente e para abri-la precisa novamente acertar um desafio lan�ado pelo painel: \n\n",
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

		Escreve("Will conseguiu abrir a porta acertando o desafio do painel. Ao entrar, ele se depara com um grande computador e um corpo todo \n"
				+ "queimado em uma cadeira de frente � tela. Em um ato de adrenalina, Will retira o corpo da cadeira e senta-se. A fim de encontrar \n"
				+ "respostas para tudo que estava acontecendo ao seu redor ele tenta acessar o computador.\n"
				+ "Novamente se depara com um desafio proposto, para acessar as informa��es daquela m�quina: \n\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--:ACESSO A GRANDE M�E:--", TimeUnit.MILLISECONDS, temp_dialog);
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

		Escreve("E l� estavam, todos acessos aos robos... Will se desespera, levanta da cadeira e leva as m�os � cabe�a come�ando a chorar de medo! \n"
				+ "Estava ali a grande oportunidade de dar um novo sentido a humanidade, a come�ar por ele. Com suas m�os na cabe�a, Will fica se \n"
				+ "recordando daquele corpo que encontrou, e se desespera mais ainda, pois �quele tamb�m pode ser seu fim. Se aproximou do corpo,  \n"
				+ "e encontrou mais uma carta, que come�ava assim: 'COMO DERROTAR A MATRIX'. Dessa forma, com as m�os tr�mulas, Will come�ou a ler  \n"
				+ "e viu que tudo isso deveria ser feito pela GRANDE M�E. A primeira coisa a se fazer era bloquear a porta para que os robos perdessem \n"
				+ "o sinal dele, pois poderiam estar em sua ca�a. Novamente chegando a porta, agora do lado de dentro, ele v� a op��o de BLOCK DOOR e \n"
				+ "clica nela. Uma mensagem sobressai no painel dizendo: 'Acerte dois desafios, um por vez, e a porta estar� bloqueada. Somente voc� poder� abri-la.' \n\n"
				+ "Will prosseguiu, e logo o primeiro desafio estava a sua frente: \n\n", TimeUnit.MILLISECONDS,
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
		Escreve("Will volta-se para o computador, senta e come�a a buscar informa��es na qual ele encontrara na carta deixada pelo morto eletrocutado\n"
				+ "Em um dos passos estava descrito que ele devia abrir um SOFTWARE chamado 'DISABLE MACHINES' Ao clicar, mais um desafio foi proposto \n"
				+ "Will notou que todos os acessos de administrador, de tudo ao seu redor, tratavasse de desafios computacionais. Em um leve devaneio \n"
				+ "lembrou-se das sua �poca de faculdade... Mas de imediato recordou sua grande miss�o de frente aquele computador, e come�ou a resolver: \n\n",
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
				+ "Os rob�s afirmam que caso ele acerte a pr�xima pergunta, a Matrix toda ser� desabilitada, caso contr�rio, o rob� poder� contraatacar.",
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

		return false;
	}

	static void sobre() throws Exception {

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