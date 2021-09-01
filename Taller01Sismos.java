
import java.util.InputMismatchException;
import java.util.Scanner;

//i. Ingresar datos
//ii. Mostrar sismo de mayor magnitud
//iii. Contar sismos mayores o iguales a 5.0
//iv. Enviar SMS por cada sismo mayor o igual a 7.0
//v.  Salir (S/N)
public class Taller01Sismos {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Sismo de mayor magnitud ");
            System.out.println("2. Sismos mayores o iguales a 5.0");
            System.out.println("3. Alerta!!! se debe evacuar zona costera!");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        final int filas=10 , columnas=7;
        int i, j;

        int[][] A = new int[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {

                int aleatorio= (int) ((int)(Math.random() *9.9) );
                A[i][j] = aleatorio;
            }
        }

        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
            }
        }









