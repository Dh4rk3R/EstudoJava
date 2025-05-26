package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

import static academy.devdojo.maratonajava.introducao.Aula05EstruturasCondicionais06Ati.scanner;

/**
 * Isso é um exemplo de comentário tipo <b>javadoc</b>
 */
public class Aula01HelloWorld {
    //Comentário de uma linhas
    /*
    Comentário de multiplas linhas

    public static void main(String[]args){
        System.out.println("Rasensasasas");
        System.out.println("Raposa");
        System.out.println("Raposa");
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", Vamos comprar uns ingressos!");



    }

}
