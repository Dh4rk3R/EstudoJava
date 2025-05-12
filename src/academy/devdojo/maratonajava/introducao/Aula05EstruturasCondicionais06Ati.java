package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais06Ati {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            for(int i=0; i<100; i++) {
            System.out.println("Escolha um número: ");
            int escolha = scanner.nextInt();

                if (escolha == 1 || escolha == 7) {
                    escolha = 1;
                } else if(escolha == 2 || escolha == 3 || escolha == 4 || escolha == 5 ||
                        escolha == 6){
                    escolha = 2;
                }

                switch (escolha) {
                    case 1:
                        System.out.println("Fim de Semana!");
                        break;
                    case 2:
                        System.out.println("Dia Util");
                        break;
                    default:
                        System.out.println("Data errada!");
                        break;
                }
        }
    }
}
