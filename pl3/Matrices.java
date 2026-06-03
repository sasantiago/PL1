	import java.util.Random;

public class Matrices {

    public static int[][] GenerarMatriz() {

        int[][] matriz = new int[3][3];

        Random rd = new Random();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = rd.nextInt(100);

            }
        }

        return matriz;
    }

    public static int[][] SumarMatrices(int[][] matriz1, int[][] matriz2) {

        int[][] matriz3 = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1[i].length; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }

        return matriz3;
    }

    public static void ImprimirMatriz(int[][] matriz) {

        System.out.println("\n" );

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();
        }
    }

    public static int SumarDiagonal(int[][] matriz3) {

        int suma = 0;

        for (int i = 0; i < matriz3.length; i++) {

            suma += matriz3[i][i];

        }

        return suma;
    }
}