package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ColocandoConhecimentoJava {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int ticket = 0;
        String processando = "Processando";
        String validando = "Validando";
        String preparando = "Preparando";


        System.out.println(". . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . Cine Java!. . . . . . . . .\n" +
                ". . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . Bem-Vindo(a). . . . . . . .\n");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ". Vamos comprar uns ingressos!");

        atribuirPontos(processando);
        Thread.sleep(1500);
        escolhaDeFilme();
        atribuirPontos(preparando);
        Thread.sleep(1500);

        System.out.println("Por gentileza, insira a idade?");
        int age = scanner.nextInt();
        System.out.println("\nBem Vindo! " + nome + " Estamos checando o valor do Ticket! Um momento!");
        Thread.sleep(1500);
        atribuirPontos(validando);
        System.out.println("\nParei aqui...... ");
    }

    private static String gerarPontos(int quant) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < quant; i++) {
            sb.append(".");
        }
        return sb.toString();
    }

    private static void atribuirPontos(String base) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int numPontos = i % 4; // alterna entre 0, 1, 2 e 3
            String pontos = gerarPontos(numPontos);
            System.out.print("\r" + base + pontos); // sobrescreve a linha
            Thread.sleep(500); // espera 0,5 seg
        }
    }

    public static void escolhaDeFilme() {
        Scanner scanner = new Scanner(System.in);
        String[] movie = {"Batman", "Superman", "Cachorros"};
        int escolha = scanner.nextInt();

        System.out.println(". . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . . . .Filmes. . . . . . . . \n");

        for (int i = 0; i < movie.length; i++) {
            System.out.print((i + 1) + ". " + movie[i]);
        }

        System.out.println("\nEscolha um filme de 1 a " + movie.length + ": ");

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu: " + movie[0]);
                break;
            case 2:
                System.out.println("Você escolheu: " + movie[1]);
                break;
            case 3:
                System.out.println("Você escolheu: " + movie[2]);
                break;
            default:
                System.out.println("Estamos sem mais opções!");
        }

    }

}
/**
 * private static String consultaIdade(String idade){
 * Ainda vai ser usada..
 * };
 */


