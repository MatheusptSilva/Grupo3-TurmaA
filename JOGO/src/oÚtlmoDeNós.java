import java.util.Scanner;

public class oÚtlmoDeNós 

{

	public static void main(String[] args)
	
	{
		
		Scanner entrada = new Scanner (System.in);
		
		boolean menu = false;
		String nome;
        int opcao; 
		
		System.out.println(" *-----------* Seja Bem Vindo ao Jogo *-----------* ");
		System.out.println("\n                  O ÚLTIMO DE NÓS                   ");
		
		System.out.print("\nPor favor, digite o nome do player: ");
		nome = entrada.next();
		
		System.out.printf("\nOlá %s", nome);
		
		do {
			
			System.out.println("\nDigite a opção desejada: ");
			
			
			System.out.println("\n(1) - Iniciar");
			System.out.println("(2) - Instruções");
			System.out.println("(3) - Como Jogar");
			System.out.println("(4) - Sair");
			
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				menu = true;
			break;
			case 2:
				System.out.println(nome + " as instruções são básicas, você deve ajudar Will Smith a desvendar todos os mistérios de CONCEITOS DA COMPUTAÇÃO. \r\n"
						+"\r\n"
						+ "Somente assim, will será capaz de vencer todas essas máquinas que estão ansiosas para lhe derrotar!!!!\r\n"
						+ "\r\n"
						+ "Lembre-se dos números e de suas conversões de bases. Este será o passo mais fácil que você percorrerá. A dificuldade aumentará ao avançar.\r\n"
						+ "\r\n"
						+ "Espero que se lembre de Maurice Karnaugh. Afinal, o mapa que ele aprimorou será um dos maiores desafios a ser enfrentados.\r\n"
						+ "\r\n"
						+ "Agora siga! Avante!!!! \\r\\n");
						
				break;
			case 3:
				System.out.println("No jogo todas as perguntas são de alternativas, por tanto leia atentamente as perguntas e digite a reposta que desejar, porém"
						+ " "
						+ "tome cuidado, pois você terá chances limitadas. ");
				break;
			case 4:
				System.out.println("");
				break;
				default:
					System.out.println("Digite uma opção válida");
			}
			
		}while(menu==false);
		
	}
	
}
