package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String tenhoMoney = "Tenho money e vou mandar 500!";
        String naotenhoMoney = "Não vou mandar nada! Se dane!";
        String resultado = salario >= 5000 ? tenhoMoney : naotenhoMoney; //Tipo de aplicação com variável ternária
        //É possível colocar tbem a msg direta, ao invés das variáveis, sendo a forma correta de utilizar.

        System.out.println(resultado);

        /**
        if(salario >= 3000){
            resultado = tenhoMoney;
        }else{
            resultado = naotenhoMoney;
        }
        */

    }
}
