import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

public class Jogo {

	static int temp_dialog = 100, temp_narrativa = 100, temp_transicao = 100;
	static int _acerto = 0;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		Escreve("\n *-----------* ·SEJA BEM VINDO AO JOGO· *-----------*", TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("\n                   O ÚLTIMO DE NÓS                   ", TimeUnit.MILLISECONDS, temp_dialog);
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
				jogar();
			} else if (opcao_menu == 2) {
				sobre();
			} else if (opcao_menu == 3) {
				creditos();
			} else if (opcao_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (opcao_menu != 1 && opcao_menu != 2 && opcao_menu != 3 && opcao_menu != 4);
	}

	static void jogar() throws Exception {
		Scanner entrada = new Scanner(System.in);

        int acerto = 0;

        // Pergunta 1
        System.out.println("*--Pergunta 1--*");        
        System.out.println("45 em binário?");
        System.out.println("A - 101101");
        System.out.println("B - 010011");
        System.out.println("C - 111111");
        System.out.println("D - 000011");
        System.out.println("E - 110011");
        String resposta1 = entrada.nextLine();

        resposta1 = resposta1.toUpperCase();
        
        switch(resposta1) {
            case "A":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }

        // Pergunta 2
        System.out.println("*--Pergunta 2--*");        
        System.out.println("10101 em Decimal");
        System.out.println("A - 24");
        System.out.println("B - 99");
        System.out.println("C - 25");
        System.out.println("D - 21");
        System.out.println("E - 15");
        String resposta2 = entrada.nextLine();

        resposta2 = resposta2.toUpperCase();
        
        switch(resposta2) {
            case "D":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "C":
            case "A":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }

        // Pergunta 3        
        System.out.println("*--Pergunta 3--*");        
        System.out.println("58 em binário?");
        System.out.println("A - 011111");
        System.out.println("B - 111011");
        System.out.println("C - 111010");
        System.out.println("D - 111001");
        System.out.println("E - 100000");
        String resposta3 = entrada.nextLine();

        resposta3 = resposta3.toUpperCase();
        
        switch(resposta3) {
            case "C":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "A":
            case "D":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }

        // Pergunta 4
        System.out.println("*--Pergunta 4--*");        
        System.out.println("AF5 em decimal?");
        System.out.println("A - 5.365");
        System.out.println("B - 5.000");
        System.out.println("C - 300");
        System.out.println("D - 6.000");
        System.out.println("E - 5.360");
        String resposta4 = entrada.nextLine();

        resposta4 = resposta4.toUpperCase();
        
        switch(resposta4) {
            case "A":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }

        System.out.println("*--Pergunta 4--*");        
        System.out.println("F17 em octal?");
        System.out.println("A - 7.00");
        System.out.println("B - 7.424");
        System.out.println("C - 7.017");
        System.out.println("D - 7.427");
        System.out.println("E - 7.217");
        String resposta5 = entrada.nextLine();

        resposta5 = resposta5.toUpperCase();
        
        switch(resposta5) {
            case "D":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "C":
            case "A":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }

        // Pergunta 6
        System.out.println("*--Pergunta 4--*");        
        System.out.println("(octal) 7.000 em decimal?");
        System.out.println("A - 3.584");
        System.out.println("B - 3.583");
        System.out.println("C - 3.585");
        System.out.println("D - 3.000");
        System.out.println("E - 3.586");
        String resposta6 = entrada.nextLine();

        resposta6 = resposta6.toUpperCase();
        
        switch(resposta6) {
            case "A":
                System.out.println("Você acertou!");

                break;
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("Você errou!");
            default:
                System.out.println("Você errou!");
        }
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
	}
