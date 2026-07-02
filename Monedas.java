import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Monedas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Leer el arreglo de monedas.
        System.out.print("Cantidad de tipos de monedas: ");
        int n = sc.nextInt();
        int[] monedas = new int[n];

        System.out.println("Ingrese las monedas:");

        for (int i = 0; i < n; i++) {
            monedas[i] = sc.nextInt();
        }

//leer la cantidad objetivo.
        System.out.print("Cantidad objetivo: ");
        int cantidad = sc.nextInt();

//inicializar el arreglo DP y el arreglo para reconstruir la solución.
        int[] dp = new int[cantidad + 1];
        int[] monedaUsada = new int[cantidad + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

//caso base para formar la cantidad 0 se necesitan 0 monedas.
        dp[0] = 0;

    //reecorrer todas las cantidades desde 1 hasta la cantidad objetivo.
        for (int i = 1; i <= cantidad; i++) {

        //probar cada moneda disponible.
            for (int moneda : monedas) {

                if (moneda <= i && dp[i - moneda] != Integer.MAX_VALUE) {

//Actualizar el mínimo de monedas cuando se encuentre una mejor solución.
                    if (dp[i - moneda] + 1 < dp[i]) {

                        dp[i] = dp[i - moneda] + 1;
                        monedaUsada[i] = moneda;
                    }
                }
            }
        }

        if (dp[cantidad] == Integer.MAX_VALUE) {

            System.out.println("No existe solución.");

        } else {

 //mostrar la cantidad mínima de monedas.
            System.out.println("\nCantidad mínima de monedas: " + dp[cantidad]);
//reconstruir la combinación utilizando el arreglo monedaUsada.
            ArrayList<Integer> combinacion = new ArrayList<>();

            int aux = cantidad;

            while (aux > 0) {
                combinacion.add(monedaUsada[aux]);
                aux -= monedaUsada[aux];
            }
//mostrar la combinación encontrada y la tabla DP.
            System.out.print("Combinación: ");

            for (int i = 0; i < combinacion.size(); i++) {

                System.out.print(combinacion.get(i));

                if (i < combinacion.size() - 1)
                    System.out.print(" + ");
            }

            System.out.println("\nTabla DP:");
            System.out.println(Arrays.toString(dp));
        }
//cierra el scanner
        sc.close();
    }
}