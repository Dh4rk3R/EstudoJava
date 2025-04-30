package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean validIdade = idade >= 18;

        if(validIdade){
            System.out.println("liberado para comprar bebida");
        }else{
            System.out.println("Não pode comprar bebida");
        }
    }
}
