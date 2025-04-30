package academy.devdojo.maratonajava.introducao;
/**
 * Um caso bem curioso sobre, é que caso a operação seja usada antes de string vai ser
 * reconhecido como operação aritmétrica, caso depois como concatenação
 * Tipo:
 *         int numero01 = 10;
 *         int numero02 = 20;
 *         int resultado = numero01+numero02;
 *
 *         System.out.println(numero01+resultado+"Valor Geral");
 *         Saída: 10 30Valor Geral
 *
 */
public class Aula04Opedores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01+numero02;

        System.out.println(resultado);


        // %
        int resto = 21%7;
        System.out.println(resto);

        //< <= >= == !=
        boolean DezMaiorQueVinte = 10 > 20;
        boolean DezMenorQueVinte = 10 < 20;
        boolean DezIgualaVinte = 10 == 20;
        boolean DezigualaDez = 10 == 10;
        boolean DezeDiferentedeDez = 10 != 10;

        System.out.println("DezMaiorQueVinte" + DezMaiorQueVinte);
        System.out.println("DezMenorQueVinte" + DezMenorQueVinte);
        System.out.println("DezIgualaVinte" + DezIgualaVinte);
        System.out.println("DezigualaDez" + DezigualaDez);
        System.out.println("DezeDiferentedeDez" + DezeDiferentedeDez);

    //&&(AND) ||(OR) !(NO)
    //Operadores de comparações

    // Mais tipos de utilidades..
    // = += -= *= /= %=
    //Ex.: double bonus = 1800
    //Ex.: bonus += 1000 => 2800
    // E assim para os demais..

    }
}
