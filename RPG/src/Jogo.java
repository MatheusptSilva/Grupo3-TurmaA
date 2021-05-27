import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Jogo {

	static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;
	static int _acerto = 0;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
        //System.out.print("                                                  +------------------------------------------------------+");
		Escreve("\n                                                   *-----------* ·SEJA BEM VINDO AO JOGO· *-----------* "          , TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("\n                                                                     O ÚLTIMO DE NÓS                    "          , TimeUnit.MILLISECONDS, temp_dialog);
		//System.out.print("-------------------------------------------------------------------------------------------------------------------------------");
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
				if(ganhar){
				    Escreve("\n Párabens você ganhou o jogo",  TimeUnit.MILLISECONDS, temp_dialog);
                }
				else{
                    Escreve("\n É meu chapa, não foi dessa vez que você ganhou!\n\n\n\n Deseja tentar de novo? S/N",  TimeUnit.MILLISECONDS, temp_dialog);
                    String jogar = entrada.next();
                    if(jogar == "S"){
                        menu();
                    }
                    else{
                        Escreve("\n Então até uma próxima meu jovem!!!!",  TimeUnit.MILLISECONDS, temp_dialog);
                    }
                }
			} else if (opcao_menu == 2) {
				sobre();
				Escreve("O jogo se passa no ano de 2035 baseado no filme eu robô, onde o nosso personagem Will Smith, após acordar de "
						+ " um coma induzido se depera com o dominio das maquinas sobre a humanidade."
						+ "\nNo jogo as perguntas são sobre a materia de conceitos da computação e todas de alternativas, por tanto leia atentamente "
						+ "as perguntas e digite a resposta que desejar, porém tome cuidade, pois você terá chances limitadas.\n", TimeUnit.MILLISECONDS, temp_dialog);
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

        //Atribuindo as perguntas, alternativas e o valor certo de resposta.
        String pergunta1 = "\n45 em binário";
        List alternativas1 = Arrays.asList("101101", "010011", "111111", "000011", "110011");
        String certa1 = "101101";

        String pergunta2 = "\n10101 em Decimal ? ";
        List alternativas2 = Arrays.asList("24", "99", "25", "21", "15");
        String certa2 = "21";

        String pergunta3 = "\n58 em binário ?";
        List alternativas3 = Arrays.asList("011111", "111011", "111010", "111001", "100000");
        String certa3 = "111010";

        String pergunta4 = "\nAF5 em decimal ?";
        List alternativas4 = Arrays.asList("5.365", "5.000", "300", "6.000", "5.360");
        String certa4 = "5.365";

        String pergunta5 = "\nF17 em octal ?";
        List alternativas5 = Arrays.asList("7.00", "7.424", "7.017", "7.427", "7.217");
        String certa5 = "7.427";

        String pergunta6 = "\n(octal) 7.000 em decimal ?";
        List alternativas6 = Arrays.asList("3.584", "3.583", "3.585", "3.000", "3.586");
        String certa6 = "3.584";

        //mostra ao jogador a quantidade de vidas que ele ainda tem.
        mostrarVidas(vidas);

        // Pergunta 1
            Escreve("Locutor: Você acordou em uma cama de hospital, em quarto com pouca iluminação, sem janelas. \n" +
                            "Você está com uma forte dor de cabeça e sente que está tudo girando ao seu redor. Você se esforça \n" +
                    "e consegue então se levantar e se dirigir até a porta. Ao chegar na porta e tentar abri-la, percebe que está fechada \n" +
                    "Após retormar um pouco de consciência, ele começa a recuperar os sentidos e a perceber melhor o ambiente. \n" +
                    "Ao olhar pelo quarto, ele vê então um corpo totalmente decomposto sentado em uma cadeira e no seu colo o que \n" +
                    "seria uma carta.\n\n",  TimeUnit.MILLISECONDS, temp_dialog);
        do {
            Escreve("--Pergunta 1--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas1, pergunta1, certa1);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);
            passou = false;
        if(vidas <= 0)
        {
        	Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);       	
            return false;
        }

        mostrarVidas(vidas);

        do {
            Escreve("--Pergunta 2--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas2, pergunta2, certa2);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);

        if(vidas <= 0)
        {
            Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
            return false;
        }
        mostrarVidas(vidas);
        passou = false;
        do {
            Escreve("--Pergunta 3--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas3, pergunta3, certa3);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);

        if(vidas <= 0)
        {
            Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
            return false;
        }

        mostrarVidas(vidas);
        passou = false;
        do {
            Escreve("--Pergunta 4--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas4, pergunta4, certa4);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);

        if(vidas <= 0)
        {
            Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
            return false;
        }

        mostrarVidas(vidas);
        passou = false;
        do {
            Escreve("--Pergunta 5--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas5, pergunta5, certa5);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);

        if(vidas <= 0)
        {
            Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
            return false;
        }

        mostrarVidas(vidas);
        passou = false;
        do {
            Escreve("--Pergunta 6--",  TimeUnit.MILLISECONDS, temp_dialog);
            Boolean acertou = perguntas(alternativas6, pergunta6, certa6);
            if(acertou == false){
                vidas--;
            }
            else{
                passou = true;
            }
        }while(passou != true && vidas != 0);

        if(vidas <= 0)
        {
            Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);
            return false;
        }

        mostrarVidas(vidas);


        return false;
	}
	
	
	
	static void sobre() throws Exception {

	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner (System.in);
        int opcao_menu, temp_narrativa = 150;
        System.out.println("SENAC - SERVIÇO NACIONAL DE APRENDIZAGEM COMERCIAL \nJogo elaborado para o PROJETO INTEGRADOR para a matéria de PI, no curso de ANÁLISE E DESENVOLVIMENTO DE SISTEMAS! \nParticiparam ativamente da criação do jogo rpg textual(desenvolvedores):");
        
        Escreve("\n\n-> •Guilherme Alves \n-> •Vinícius Santana \n-> •Matheus Thome \n-> •Gustavo Souza \n-> •Gustavo da Silva Oliveira",TimeUnit.MILLISECONDS, temp_narrativa);
        do{
        System.out.println("\n2 - Sair");
        opcao_menu = entrada.nextInt();
        if(opcao_menu == 2){
          menu();
        }else{
           System.out.println("\nOpção inválida, digite novamente: ");
        }}while(opcao_menu!=2);
	}

	static void mostrarVidas(int vidasRestantes){
        System.out.println("                                     +-------------------+");
        System.out.println("                                     |     VIDAS: " +vidasRestantes+ "      |");
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


