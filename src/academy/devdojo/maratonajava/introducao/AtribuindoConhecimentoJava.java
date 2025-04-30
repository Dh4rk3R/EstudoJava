package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class AtribuindoConhecimentoJava {

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int ticket = 0;
        String base = "Processando";
        String base1 = "Validando";

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá "+nome+". Vamos comprar uns ingressos!");
        System.out.println("Por gentileza, insira a idade?");
//        String age = scanner.nextInt();
        int age = scanner.nextInt();

        atribuirPontos(base);
        Thread.sleep(1500);
        System.out.println("\nBem Vindo! "+nome+" Estamos validando o valor do Ticket! Um momento!");
        Thread.sleep(1500);

        atribuirPontos(base1);
        System.out.println("\nParei aqui...... ");
    }
    public static String gerarPontos(int quant) {
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
//        if(age)

}
