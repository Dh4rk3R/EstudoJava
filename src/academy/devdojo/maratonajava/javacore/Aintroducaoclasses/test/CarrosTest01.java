package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carros = new Carros();
        Carros carros1 = new Carros();

        carros.nome = ("fiat");
        carros.modelo = ("Palio");
        carros.ano = 2012;


        carros1.nome = ("Renoult");
        carros1.modelo = ("Atrevos");
        carros1.ano = 2016;


        System.out.println("O "+ carros.nome +" com o modelo "+ carros.modelo +" foi criado em " + carros.ano);
        System.out.println("------------");
        System.out.println("O "+ carros1.nome +" com o modelo "+ carros1.modelo +" foi criado em " + carros1.ano);




    }
}
