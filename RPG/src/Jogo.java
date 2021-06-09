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

		String pergunta5 = "\nDuas tartarugas estavam juntas e come�aram a caminhar em linha reta em dire��o a um lago distante. A primeira tartaruga " +
				"percorreu 30 metros por dia e demorou 16 dias para chegar ao lago. A segunda tartaruga s� conseguiu percorrer 20 metros por dia e, " +
				"portanto, chegou ao lago alguns dias depois da primeira. Quando a primeira tartaruga chegou ao lago, o n�mero de dias que ela teve que " +
				"esperar para a segunda tartaruga chegar foi:";
		List alternativas5 = Arrays.asList("8", "9", "10", "12", "15");
		String certa5 = "8";

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

		Escreve("Uma porta se abre, no entanto, uma outra porta estava em sua frente, na parte superior da porta se encontra a seguinte mensagem:" +
						" \n\n", TimeUnit.MILLISECONDS,
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

		Escreve("ACESSO AO LABORATORIO LIBERADO! \n\n", TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("Will ent�o entra em seu laborat�rio encontra um local totalmente sujo e repleto de armas e corpos. Estava funcionando com pouca " +
						"energia, apenas com luzes de emerg�ncia, ele se dirige a um gerador e liga. As luzes voltam a se acender e ent�o o cenario fica " +
						"ainda mais assustador. Will se assusta, por�m mant�m o foco e vai at� o computador principal, onde est� sendo sinalizado a exist�ncia " +
						"de uma mensagem de v�deo. O v�deo foi feito por sua mulher, nele ela conta ent�o o que estava acontecendo na �poca: \n\n" +
						"Will, eu espero que voc� n�o precise ver este v�deo e que voc� acorde antes para nos ajudar, mas se voc� j� est� vendo, acredito que " +
						"eu j� n�o esteja mais viva. Voc� lembra do nosso projeto e transferir a consci�ncia humana para um robo? Ent�o... quando estavamos " +
						"quase terminando o projeto, voc� sofreu um grave atentado. Ficou entre a vida e a morte, em um ato de desespero, usei toda a tecnologia " +
						"que tinha em minhas m�os para fazer de voc� o primeiro a usufluir dessa nova tecnologia. Mas no meio do processo, uma c�pia do que seria " +
						"a sua consci�ncia foi corrompida e escapou os nossos sistemas de seguran�a, se instalando nas redes de todo o mundo. Passamos muito tempo " +
						"tentando descobrir como desativar essa intelig�ncia, mas n�o fomos capazes. No come�o achavamos que seria algo inofencivo, at� que pudemos " +
						"perceber que essa inteligencia estava alterando dados e informa��es, para que atritos entre os povos fossem gerados e no final, at� acabou " +
						"contribuindo para a  constru��o de robos com intelig�ncia artificial, robos os quais ele acabou dominando tamb�m. Fizemos os ajustes e contruimos " +
						"um robo para abrigar a sua consci�ncia. A esperan�a da humanidade � que voc� consiga impedir a sua pr�pria consci�ncia. Parte da popula��o se " +
						"mudou para o subterr�neo para tentar uma nova vida, mas acreditamos que as m�quinas n�o v�o deixar isso acontecer por muito tempo. Descobrimos um " +
						"meio de entrar em contato direto com a rede das m�quinas, por�m n�o tentamos usar essa ponte, pois dessa forma poderiamos acabar entregando a " +
						"exist�ncia desse laborat�rio e tamb�m do nosso plano com voc�. Colocamos um pequeno desafio que vai aparecer assim que esse v�deo acabar, � s� " +
						"voc� colocar a reposta certa que esse canal de comunica��o vai se abrir com a intelig�ncia. Todos n�s contamos com voc�, eu consto com voc�! Te " +
						"amo Will, pe�o desculpa por ter deixado tudo isso acontecer e n�o ter te deixado pronto antes, daria tudo para te ter de novo em meus bra�os. \n\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Escreve("--CONNECTING WITH I.A--", TimeUnit.MILLISECONDS, temp_dialog);
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
		
		Escreve("C�digos come�aram a aparecer na tela, e ent�o uma voz semelhante a de Will come�a a sair dos auto-falantes da sala. \n\n\n\n" +
						"Quem � que ousa invadir a minha rede de forma direta? Achei que j� tivesse blindado completamente as minhas falhas de acesso. Se voc� " +
						"encontrou essa falha, voc� ",
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