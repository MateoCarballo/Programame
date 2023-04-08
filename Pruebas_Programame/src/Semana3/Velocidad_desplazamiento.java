package Pruebas_Programame.src.Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.aceptaelreto.com/problem/statement.php?id=439&cat=8
public class Velocidad_desplazamiento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = br.readLine().split(" ");
            Arrays.sort(entrada);
            if (entrada[0].contains("D=")) {
                if (entrada[1].contains("T=")) {
                    System.out.println("V="
                            + (Integer.parseInt(entrada[0].substring(2)) / Integer.parseInt(entrada[1].substring(2))));
                } else {
                    System.out.println("T="
                            + (Integer.parseInt(entrada[0].substring(2)) / Integer.parseInt(entrada[1].substring(2))));
                }
            } else if (entrada[0].contains("T=")) {
                System.out.println(
                        "D=" + (Integer.parseInt(entrada[1].substring(2)) * Integer.parseInt(entrada[0].substring(2))));
            }
        }
    }
}
