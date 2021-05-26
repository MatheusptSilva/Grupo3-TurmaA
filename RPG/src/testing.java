import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) throws Exception {
        List respostas = new ArrayList();
        respostas.add("101101");
        respostas.add("010011");
        respostas.add("111111");
        respostas.add("000011");
        respostas.add("110011");

        String pergunta = "45 em binário";
        String certa = "101101";

        Boolean acertou = perguntas(respostas, pergunta, certa);

        System.out.println(acertou);
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
                    System.out.println("Resposta incorreta!");
                }
                break;
            case "b":
            case "B":
                if (valores.get(1).equals(certa)) {
                    System.out.println("Resposta correta!");
                    acertou = true;
                } else {
                    System.out.println("Resposta incorreta!");

                }
                break;
            case "c":
            case "C":
                if (valores.get(2).equals(certa)) {
                    System.out.println("Resposta correta!");
                    acertou = true;
                } else {
                    System.out.println("Resposta incorreta!");

                }
                break;
            case "d":
            case "D":
                if (valores.get(3).equals(certa)) {
                    System.out.println("Resposta correta!");
                    acertou = true;
                } else {
                    System.out.println("Resposta incorreta!");

                }
                break;
            case "e":
            case "E":
                if (valores.get(4).equals(certa)) {
                    System.out.println("Resposta correta!");
                    acertou = true;
                } else {
                    System.out.println("Resposta incorreta!");
                }
                break;
            default:
                System.out.println("Escolha inválida!");
        }

        return acertou;
    }
}
