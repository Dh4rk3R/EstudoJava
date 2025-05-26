package academy.devdojo.maratonajava.meuconhecimento;
import java.util.Scanner;

public class ColocandoConhecimentoJava {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String processando = "Processando";
        String validando = "Validando";
        String preparando = "Preparando";

        String[] movie = {"Batman", "Superman", "Cachorros"};
        int[] precos = {20, 20, 10};//valores
        String[] tipmoney = {"Débito", "Crédito", "Pix"};

        System.out.println(". . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . Cine Java!. . . . . . . . .\n" +
                ". . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . Bem-Vindo(a). . . . . . . .\n");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", Vamos comprar uns ingressos!");

        atribuirPontos(processando);
        Thread.sleep(1500);

        int escolha = escolhaDeFilme(movie);
        atribuirPontos(preparando);
        Thread.sleep(1500);

        System.out.println("\nPor gentileza, insira a idade?");
        int age = scanner.nextInt();
        System.out.println("\n"+ nome + " Estamos checando algumas coisas! Um momento!");
        Thread.sleep(1500);
        atribuirPontos(validando);

        try {
            validaIdade(escolha, age, nome, processando); // encerra o programa
        } catch (Exception e) {
            System.out.println("\nDesculpe " + nome + ", o filme escolhido é impróprio para menores de 18 anos.");
            System.out.println("\nInfelizmente o ingresso não pode ser emitido.");
            throw new RuntimeException(e);
        }

        // Quant
        System.out.println("\nQuantos ingressos deseja comprar?");
        int quantidade = scanner.nextInt();
        System.out.println("\nCalculando valor total!");
        atribuirPontos(validando);
        int valorTotal = precos[escolha - 1] * quantidade;
        System.out.println("\nValor total: R$ " + valorTotal + ",00");

        // pay
        scanner.nextLine();
        int formaDePag = escolhaDePagament(tipmoney);
        atribuirPontos(preparando);

        System.out.println("\nForma de pagamento selecionada: " + formaDePag);
        atribuirPontos("Pagamento - "+processando);

        System.out.println("\nPagamento aprovado com sucesso!");
        System.out.println("\nResumo da compra:");
        System.out.println("Nome: " + nome);
        System.out.println("Filme: " + movie[escolha - 1]);
        System.out.println("Quantidade de ingressos: " + quantidade);
        System.out.println("Forma de pagamento: " + formaDePag);
        System.out.println("Total pago: R$ " + valorTotal + ",00");
        System.out.println("\nAproveite o filme e volte sempre!");
    }

    private static void validaIdade(int escolha, int age, String nome, String processando) throws Exception {
        if (escolha == 1 && age < 18) {
            throw new Exception("o filme escolhido é impróprio para menores de 18 anos.");
        }
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
            int numPontos = i % 4;
            String pontos = gerarPontos(numPontos);
            System.out.print("\r" + base + pontos);
            Thread.sleep(500);
        }
    }

    public static int escolhaDeFilme(String[] movie) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n. . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . . .Filmes. . . . . . . . . \n");

        System.out.println("Escolha um filme de 1 a " + movie.length + ": ");

        for (int i = 0; i < movie.length; i++) {
            System.out.print((i + 1) + "." + movie[i] + "\n");
        }

        int escolha = scanner.nextInt();

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

        return escolha;
    }

    public static int escolhaDePagament(String[] tipmoney) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n. . . . . . . . . . . . . . . . . . . . .\n" +
                ". . . . . . . . .Pagamento. . . . . . . . . \n");

        System.out.println("Qual forma de Pagamento 1 a " + tipmoney.length + ": ");

        for (int i = 0; i < tipmoney.length; i++) {
            System.out.print((i + 1) + "." + tipmoney[i] + "\n");
        }

        int forma = scanner.nextInt();

        switch (forma) {
            case 1:
                System.out.println("Você escolheu: " + tipmoney[0]);
                break;
            case 2:
                System.out.println("Você escolheu: " + tipmoney[1]);
                break;
            case 3:
                System.out.println("Você escolheu: " + tipmoney[2]);
                break;
            default:
                System.out.println("Estamos sem mais opções!");
        }
        return forma;
    }
}