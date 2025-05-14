package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticaoAti {
    public static void main(String[] args) {
    int num = 0;
    /*while(num<1000000){
        System.out.println("Mais um.. Tomalitii " + num);
        num += 2;
    }
    do {
        System.out.println("Mais um.. Tomalitii " + num);
        num += 2;
    } while (num<1000000);
    for (num=0; num<=1000000; num +=2){
        System.out.println("Mais um.. Tomalitii " + num);
    }-----------------formas de fazer-------------------
    for (num=999900; num<=1000000; num++){//ate 1milhao de pá em pá
            System.out.println("Mais um.. Tomalitii " + num);
        }*/
    int var = 50;
    for (int i = 0; i <= var; i++) {
            if(i > 25){
                break;
            }System.out.println(i);
        }
    }
}
