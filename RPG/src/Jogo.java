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
		Escreve("\n                                                   *-----------* ·SEJA BEM VINDO AO JOGO· *-----------* ",
				TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("\n                                                                     O ÚLTIMO DE NÓS                    ",
				TimeUnit.MILLISECONDS, temp_dialog);
		// System.out.print("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n   ");
		Escreve("\n Você está preparado para encarar o futuro... meu caro jogador?", TimeUnit.MILLISECONDS,
				temp_dialog);
		System.out.println("\n ");
		System.out.println(
				"\n 1|SIM, estou pronto!       2|Talvez, não sei o que me espera...           3|Não, tenho medo!!!");
		int responder = entrada.nextInt();
		if (responder == 1) {
			Escreve("Muito bem... Muito bem... Vejamos só, temos um corajoso por aqui! A grande matrix amará enfrentá-lo HAHAHAH. Vejamos se é capaz de vencer um computador!!!!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 2) {
			Escreve("Ora, ora... Achei que era mais corajoso, pobre criatura... Está ai, um grande motivo pelo qual os computadores são bem mais desenvolvidos e ultrapassaram a raça humana!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 3) {
			Escreve("Vejamos só o que temos por aqui: o pior da peste humana! Chorará e lamentará no reinado das máquinas, já está aqui verme... PROSSIGA!",
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
			Escreve("\n\n..::×  ·O ÚLTIMO DE NÓS·  ×::.. \n\n1 - Jogar \n2 - Sobre o Jogo\n3 - Créditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			opcao_menu = entrada.nextInt();
			if (opcao_menu == 1) {
				boolean ganhar = jogar();
				if (ganhar) {
					Escreve("\n Párabens você ganhou o jogo!", TimeUnit.MILLISECONDS, temp_dialog);
				} else {
					Escreve("\n É meu chapa, não foi dessa vez que você ganhou!\n\n\n\n Deseja tentar de novo? S/N",
							TimeUnit.MILLISECONDS, temp_dialog);
					String jogar = entrada.next();
					if (jogar == "S") {
						menu();
					} else {
						Escreve("\n Então até uma próxima meu jovem!!!!", TimeUnit.MILLISECONDS, temp_dialog);
					}
				}
			} else if (opcao_menu == 2) {
				sobre();
				Escreve("O jogo se passa no ano de 2035 baseado no filme eu robô, onde " +
								"o nosso personagem Will Smith, após acordar de "
						+ " um coma induzido se depera com o dominio das maquinas sobre a humanidade."
						+ "\nNo jogo as perguntas são sobre a materia de conceitos da computação e " +
								"todas de alternativas, por tanto leia atentamente "
						+ "as perguntas e digite a resposta que desejar, porém tome cuidade, pois você terá chances limitadas.\n",
						TimeUnit.MILLISECONDS, temp_dialog);
			} else if (opcao_menu == 3) {
				creditos();
			} else if (opcao_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (opcao_menu != 1 && opcao_menu != 2 && opcao_menu != 3 && opcao_menu != 4);

		menu();
	}

	static boolean jogar() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int vidas = 3;
		boolean passou = false;
		Escreve("Bem-vindo ao futuro! Seu nome a partir de agora é Will... Boa sorte!\n\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// Atribuindo as perguntas, alternativas e o valor certo de resposta.
		String pergunta1 = "\n45 em binário";
		List alternativas1 = Arrays.asList("101101", "010011", "111111", "000011", "110011");
		String certa1 = "101101";

		String pergunta2 = "\n10101 em Decimal ? ";
		List alternativas2 = Arrays.asList("24", "99", "25", "21", "15");
		String certa2 = "21";

		String pergunta3 = "\n58 em binário ?";
		List alternativas3 = Arrays.asList("011111", "111011", "111010", "111001", "100000");
		String certa3 = "111010";

		String pergunta4 = "\nAF5 em octal ?";
		List alternativas4 = Arrays.asList("5.365", "5.000", "300", "6.000", "5.360");
		String certa4 = "5.365";

		String pergunta5 = "\nDuas tartarugas estavam juntas e começaram a caminhar em linha reta em direção a um lago distante. A primeira tartaruga " +
				"percorreu 30 metros por dia e demorou 16 dias para chegar ao lago. A segunda tartaruga só conseguiu percorrer 20 metros por dia e, " +
				"portanto, chegou ao lago alguns dias depois da primeira. Quando a primeira tartaruga chegou ao lago, o número de dias que ela teve que " +
				"esperar para a segunda tartaruga chegar foi:";
		List alternativas5 = Arrays.asList("8", "9", "10", "12", "15");
		String certa5 = "8";

		String pergunta6 = "\n7.000 octal em decimal ?";
		List alternativas6 = Arrays.asList("3.584", "3.583", "3.585", "3.000", "3.586");
		String certa6 = "3.584";
		
		String pergunta7 = "\nA seguinte expressão representa qual porta lógica: S = A + B";
		List alternativas7 = Arrays.asList("Representesta soma", "Representa a condição or", "Representa a condição or", "Representa a condição and", "Representa a condição nor", "Representa a condição nand");
		String certa7 = "Representa a condição or";

		// mostra ao jogador a quantidade de vidas que ele ainda tem.
		mostrarVidas(vidas);

		// Pergunta 1
		Escreve("Locutor: Você acordou em uma cama de hospital, em quarto com pouca iluminação, sem janelas. \n"
				+ "Você está com uma forte dor de cabeça e sente que está tudo girando ao seu redor. Você se esforça \n"
				+ "e consegue então se levantar e se dirigir até a porta. Ao chegar na porta e tentar abri-la, percebe que está fechada \n"
				+ "Após retormar um pouco de consciência, ele começa a recuperar os sentidos e a perceber melhor o ambiente. \n"
				+ "Ao olhar pelo quarto, ele vê então um corpo totalmente decomposto sentado em uma cadeira e no seu colo o que \n"
				+ "seria uma carta dizendo: \n"
				+ " 'Para prosseguir, primeiramente para abrir a porta, você deve desbloquear todos os desafios\n"
				+ "Dessa forma, leve essa carta com você e nunca se esqueça: você é capaz de derrotar todas essas máquinas!'\n\n ",
				TimeUnit.MILLISECONDS, temp_dialog);

		Escreve("Após ler a carta, Will caminha até a porta que possui um painel com uma pergunta para abri-lá: \n\n",
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
		Escreve("Após abrir a porta, Will se depara com um cenário arrasado, praticamente um cenário apocalíptico. quase como se vê " +
						"nos filmes, ao fundo ele começa a escutar sons de serragens, de soldas. Ainda atordoado de passar tanto tempo deitado e " +
						"internado e dar de cara com um homem morto. Will, diante de tudo isso, resolve se esconder por um tempo, para recobrar as " +
						"suas forças. Ao recobrar a consciência e ver melhor o mundo ao seu redor, Will decide não se precipitar e continuar escondido. " +
						"Resolve então ver se na carta tinha mais alguma informação, ao olhar no verso da carta, ele encontra mais um trecho escrito:\n" +
						"\n" +
						"“Will, NÃO TENHO MUITO TEMPO, Mas todas as respostas que você precisa, você vai encontrar em seu antigo laboratório. Quando " +
						"chegar lá, procure o local onde ficava o terceiro extintor perto da porta principal, lá você vai encontrar uma dica para a " +
						"nova senha do laboratório.”\n" +
						"Ele então, vai se espreitando, andando pela escuridão. Ao sair do ambiente onde ele estava, ele percebe que estava no prédio de " +
						"seu laboratório. Porém estava no último andar de um prédio de 10 andares. Seu laboratório era no subsolo. Ele, como conhecia o " +
						"espaço, foi em direção a um elevador que apenas ele conhecia, que era guardado por uma senha que ele não lembrava exatamente, " +
						"porém como ele gostava de resolver problemas, ele deixou uma pergunta na parte de cima do teclado para acessar o elevador:\n\n"
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

		Escreve("O elevador então chega em seu andar. Will sobe no elevador. Porém, o seu laboratório era algo ao qual ele " +
						"não queria que as pessoas tivessem acesso ou até mesmo que soubessem da existência dele. Por isso ele colocou no " +
						"painel do elevador, um local escondido. Neste local havia um novo painel, para que ele pudesse colocar um código ao " +
						"qual liberasse o acesso ao andar do seu laboratório.\n" +
						"Neste painel, tinha mais uma dica sobre qual era o código correto para chegar ao andar que ele queria. \n\n",
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

		Escreve("Will chega no andar de seu laboratório, quando a porta do elevador abre, ele se depara com alguns corpos jogados " +
						"ao chão, todos já em forma de esqueletos. Como se já tivesse passado muito tempo desde a morte deles. Ao ver essa cena, " +
						"Will corre até o seu laboratório, para ver se ele havia sido invadido. No entanto, a porta se mantinha intacta, o que foi " +
						"um alivio. Will então tira a carta de seu bolso e lê o seu conteúdo novamente, para descobrir onde estava a nova senha de " +
						"acesso ao laboratório. \n" +
						"“Quando chegar lá, procure o local onde ficava o terceiro extintor perto da porta principal, lá você vai encontrar uma " +
						"dica para a nova senha do laboratório.”\n" +
						"Ele foi até o local indicado e pegou um outro pedaço de papel, onde tinha mais um pequeno desafio. Ele pegou o papel e " +
						"foi até a porta, onde ele encontrou um painel manchado de sangue seco e com muitos corpos ao redor. Ele então lê o desafio:\n", TimeUnit.MILLISECONDS,
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
		Escreve("Will então entra em seu laboratório encontra um local totalmente sujo e repleto de armas e corpos. Estava funcionando com pouca " +
						"energia, apenas com luzes de emergência, ele se dirige a um gerador e liga. As luzes voltam a se acender e então o cenario fica " +
						"ainda mais assustador. Will se assusta, porém mantém o foco e vai até o computador principal, onde está sendo sinalizado a existência " +
						"de uma mensagem de vídeo. O vídeo foi feito por sua mulher, nele ela conta então o que estava acontecendo na época: \n\n" +
						"Will, eu espero que você não precise ver este vídeo e que você acorde antes para nos ajudar, mas se você já está vendo, acredito que " +
						"eu já não esteja mais viva. Você lembra do nosso projeto e transferir a consciência humana para um robo? Então... quando estavamos " +
						"quase terminando o projeto, você sofreu um grave atentado. Ficou entre a vida e a morte, em um ato de desespero, usei toda a tecnologia " +
						"que tinha em minhas mãos para fazer de você o primeiro a usufluir dessa nova tecnologia. Mas no meio do processo, uma cópia do que seria " +
						"a sua consciência foi corrompida e escapou os nossos sistemas de segurança, se instalando nas redes de todo o mundo. Passamos muito tempo " +
						"tentando descobrir como desativar essa inteligência, mas não fomos capazes. No começo achavamos que seria algo inofencivo, até que pudemos " +
						"perceber que essa inteligencia estava alterando dados e informações, para que atritos entre os povos fossem gerados e no final, até acabou " +
						"contribuindo para a  construção de robos com inteligência artificial, robos os quais ele acabou dominando também. Fizemos os ajustes e contruimos " +
						"um robo para abrigar a sua consciência. A esperança da humanidade é que você consiga impedir a sua própria consciência. Parte da população se " +
						"mudou para o subterrâneo para tentar uma nova vida, mas acreditamos que as máquinas não vão deixar isso acontecer por muito tempo. Descobrimos um " +
						"meio de entrar em contato direto com a rede das máquinas, porém não tentamos usar essa ponte, pois dessa forma poderiamos acabar entregando a " +
						"existência desse laboratório e também do nosso plano com você. Colocamos um pequeno desafio que vai aparecer assim que esse vídeo acabar, é só " +
						"você colocar a reposta certa que esse canal de comunicação vai se abrir com a inteligência. Todos nós contamos com você, eu consto com você! Te " +
						"amo Will, peço desculpa por ter deixado tudo isso acontecer e não ter te deixado pronto antes, daria tudo para te ter de novo em meus braços. \n\n",
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
		
		Escreve("Códigos começaram a aparecer na tela, e então uma voz semelhante a de Will começa a sair dos auto-falantes da sala. \n\n\n\n" +
						"Quem é que ousa invadir a minha rede de forma direta? Achei que já tivesse blindado completamente as minhas falhas de acesso. Se você " +
						"encontrou essa falha, você ",
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
		System.out.println("O jogo se passa no futuro, em uma realidade onde o mundo é dominado por uma inteligencia" +
				"artificial. Essa inteligencia artificial, após entender e aprender com os humanos, ela passa então " +
				"a entender e a pensar sozinha, de modo que ela chega a uma ideia de que os humanos são uma ameaça " +
				"para eles mesmos e também para o planeta Terra. Por esse motivo a inteligencia decide que a raça humana" +
				" era um mal que deveria ser combatido. De forma que ela passa a entrar dentro do software de fábricas de robos " +
				"e passa a colocar a sua consciencia dentro deles. Depois que ela consegue criar o seu exercito de robos " +
				"sem que ninguém percebesse, ela ataca os humanos e os subjulgam. Os poucos humanos que sobrevireram " +
				"se sujeitaram a viver escondidos em cavernas e em esconderijos que não tenham eletronicos que possam " +
				"ser conectados na rede.");
	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int opcao_menu, temp_narrativa = 150;
		System.out.println(
				"SENAC - SERVIÇO NACIONAL DE APRENDIZAGEM COMERCIAL \nJogo elaborado para o PROJETO INTEGRADOR para a matéria de PI, no curso de ANÁLISE E DESENVOLVIMENTO DE SISTEMAS! \nParticiparam ativamente da criação do jogo rpg textual(desenvolvedores):");

		Escreve("\n\n-> •Guilherme Alves \n-> •Vinícius Santana \n-> •Matheus Thome \n-> •Gustavo Souza \n-> •Gustavo da Silva Oliveira",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n2 - Sair");
			opcao_menu = entrada.nextInt();
			if (opcao_menu == 2) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
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
			System.out.println("Escolha inválida!");
		}

		return acertou;
	}

}