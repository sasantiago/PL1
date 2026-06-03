import java.util.Scanner;

public class Impresora {

    public static void Menu() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];

        int opcion;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear matrices");
            System.out.println("2. Sumar matrices");
            System.out.println("3. Imprimir matrices");
            System.out.println("4. Sumar diagonal");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    matriz1 = Matrices.GenerarMatriz();
                    matriz2 = Matrices.GenerarMatriz();

                    System.out.println("Matrices creadas");

                    break;

                case 2:

                    matriz3 = Matrices.SumarMatrices(matriz1, matriz2);

                    System.out.println("Matrices sumadas");

                    break;

                case 3:

                    Matrices.ImprimirMatriz(matriz1);
                    Matrices.ImprimirMatriz(matriz2);
                    Matrices.ImprimirMatriz(matriz3);

                    break;

                case 4:

                    int suma = Matrices.SumarDiagonal(matriz3);

                    System.out.println("Diagonal: " + suma);

                    break;

                case 5:

                    System.out.println("Gracias");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);
    }
}