package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01Foreach {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0] = new int[3];
        dias[1] = new int[4];
        dias[2] = new int[6];

        /*
        dias[0][0] = 01;
        dias[0][1] = 02;
        dias[0][2] = 03;

        dias[1][0] = 15;
        dias[1][1] = 16;
        dias[1][2] = 17;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        */


        for (int[] baseRRay : dias) {
            System.out.println("\n----------");
            for (int num : baseRRay) {
                System.out.print(num);
            }
        }


    }
}
