import java.util.Arrays;
import java.util.Scanner;

public class Escaleras {

    public static void main(String[] args) {
//lee el numero de escalones
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de escalones: ");
        int n = sc.nextInt();
//crea un arreglo "dp" de n+1
        int[] dp = new int[n + 1];

// Casos base
        dp[0] = 1;

        if (n >= 1)
            dp[1] = 1;

// Programación dinámica
  //recorre desde 2 a N
        for (int i = 2; i <= n; i++) {
            //aplica la relacion
            dp[i] = dp[i - 1] + dp[i - 2];
        }
//mostrar el resultado
        System.out.println("\nFormas posibles: " + dp[n]);
        System.out.println("Tabla DP:");
        System.out.println(Arrays.toString(dp));
//cierra el scaner
        sc.close();
    }
}