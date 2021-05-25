import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

public class Jogo {

	static int temp_dialog = 100, temp_narrativa = 100, temp_transicao = 100;
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
				jogar();
			} else if (opcao_menu == 2) {
				sobre();
				Escreve("O jogo se passa no ano de 2035 baseado no filme eu robô, onde o nosso personagem Will Smith, após acordar de "
						+ " um coma induzido se depera com o dominio das maquinas sobre a humanidade."
						+ "\nNo jogo as perguntas são sobre a materia de conceitos da computação e todas de alternativas, por tanto leia atentamente "
						+ "as perguntas e digite a resposta que desejar, porém tome cuidade, pois você terá chances limitadas.", TimeUnit.MILLISECONDS, temp_dialog);
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
	

	static void jogar() throws Exception {
		Scanner entrada = new Scanner(System.in);

        char resposta1, resposta2, resposta3, resposta4, resposta5, resposta6;
        int cont = 0;
        int vidas = 3; 
        
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 1
        Escreve("--Pergunta 1--",  TimeUnit.MILLISECONDS, temp_dialog);                                 
        Escreve("\n45 em binário ?",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 101101");
        System.out.println("B - 010011");
        System.out.println("C - 111111");
        System.out.println("D - 000011");
        System.out.println("E - 110011");
        
        System.out.print("Digite a opção desejada: ");
        resposta1 = entrada.next().charAt(0);
        //resposta1 = resposta1.toUpperCase();
       
        switch(resposta1) {
            case 'A':
                System.out.println("******* VOCÊ ACERTOU *******\n");
               break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                Escreve("Você errou!, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida!\n", TimeUnit.MILLISECONDS, temp_dialog);
         }
        
        }while(resposta1 != 'A' && cont<3 && vidas>=0 && vidas<=3);
            
        if(vidas <= 0)
        {
        	Escreve("                              GAME OVER ", TimeUnit.MILLISECONDS, temp_dialog);       	
        }
       
            
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 2
        Escreve("--Pergunta 2--",  TimeUnit.MILLISECONDS, temp_dialog);       
        Escreve("\n10101 em Decimal ? ",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 24");
        System.out.println("B - 99");
        System.out.println("C - 25");
        System.out.println("D - 21");
        System.out.println("E - 15");
        
        System.out.print("Digite a opção desejada: ");
        resposta2 = entrada.next().charAt(0);
       // resposta2 = resposta2.toUpperCase();
        
        switch(resposta2) {
            case 'D':
                System.out.println("******* VOCÊ ACERTOU *******\n");
                break;
            case 'B':
            case 'C':
            case 'A':
            case 'E':
                Escreve("Você errou, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida\n", TimeUnit.MILLISECONDS, temp_dialog);          
        }
        }while(resposta2 != 'D' && cont<3 && vidas>=0 && vidas<=3);
        
        if(vidas <= 0)
        {
        	Escreve("Game Over", TimeUnit.MILLISECONDS, temp_dialog);
        	
        }
        
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 3        
        Escreve("--Pergunta 3--",  TimeUnit.MILLISECONDS, temp_dialog);        
        Escreve("\n58 em binário ?",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 011111");
        System.out.println("B - 111011");
        System.out.println("C - 111010");
        System.out.println("D - 111001");
        System.out.println("E - 100000");
        
        System.out.print("Digite a opção desejada: ");
        resposta3 = entrada.next().charAt(0);
        //resposta3 = resposta3.toUpperCase();
        
        switch(resposta3) {
            case 'C':
                System.out.println("******* VOCÊ ACERTOU *******\n");
                break;
            case 'B':
            case 'A':
            case 'D':
            case 'E':
                Escreve("Você errou, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida\n", TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resposta3 != 'C' && cont<3 && vidas>=0 && vidas<=3);
      
        if(vidas <= 0)
        {
        	Escreve("Game Over", TimeUnit.MILLISECONDS, temp_dialog);
        	
        }
        
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 4
        Escreve("--Pergunta 4--",  TimeUnit.MILLISECONDS, temp_dialog);    
        Escreve("\nAF5 em decimal ?",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 5.365");
        System.out.println("B - 5.000");
        System.out.println("C - 300");
        System.out.println("D - 6.000");
        System.out.println("E - 5.360");
        
        System.out.print("Digite a opção desejada: ");
        resposta4 = entrada.next().charAt(0);
        //resposta4 = resposta4.toUpperCase();
        
        switch(resposta4) {
            case 'A':
                System.out.println("******* VOCÊ ACERTOU *******\n");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                Escreve("Você errou, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida\n", TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resposta4 != 'A' && cont<3 && vidas>=0 && vidas<=3);
       
        if(vidas <= 0)
        {
        	Escreve("Game Over", TimeUnit.MILLISECONDS, temp_dialog);
        	
        }
        
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 5	
        Escreve("--Pergunta 5--",  TimeUnit.MILLISECONDS, temp_dialog);       
        Escreve("\nF17 em octal ?",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 7.00");
        System.out.println("B - 7.424");
        System.out.println("C - 7.017");
        System.out.println("D - 7.427");
        System.out.println("E - 7.217");
        
        System.out.print("Digite a opção desejada: ");
        resposta5 = entrada.next().charAt(0);
        //resposta5 = resposta5.toUpperCase();
        
        switch(resposta5) {
            case 'D':
                System.out.println("******* VOCÊ ACERTOU *******\n");
                break;
            case 'B':
            case 'C':
            case 'A':
            case 'E':
                Escreve("Você errou, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida\n", TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resposta5 != 'D' && cont<3 && vidas>=0 && vidas<=3);
        
        if(vidas <= 0)
        {
        	Escreve("Game Over", TimeUnit.MILLISECONDS, temp_dialog);
        	
        }

        
        do {
        	 System.out.println("                                     +-------------------+");
             System.out.println("                                     |     VIDAS: " +vidas+ "      |");
             System.out.println("                                     +-------------------+");
        	
        // Pergunta 6
        Escreve("--Pergunta 6--",  TimeUnit.MILLISECONDS, temp_dialog);  
        Escreve("\n(octal) 7.000 em decimal ?",  TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\nA - 3.584");
        System.out.println("B - 3.583");
        System.out.println("C - 3.585");
        System.out.println("D - 3.000");
        System.out.println("E - 3.586");
        
        System.out.print("Digite a opção desejada: ");
        resposta6 = entrada.next().charAt(0);
        //resposta6 = resposta6.toUpperCase();
        
        switch(resposta6) {
            case 'A':
                System.out.println("******* VOCÊ ACERTOU *******\n");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                Escreve("Você errou, tente novamente\n", TimeUnit.MILLISECONDS, temp_dialog);
                cont = cont + 1;
                vidas--;
                break;
            default:
                Escreve("Opção inválida\n", TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resposta6 != 'A' && cont<3 && vidas>=0 && vidas<=3);
        
        if(vidas <= 0)
        {
        	Escreve("Game Over", TimeUnit.MILLISECONDS, temp_dialog);
        	
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
