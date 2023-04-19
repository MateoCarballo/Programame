package Semana2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.aceptaelreto.com/problem/statement.php?id=340
public class CuadradosConCerillas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = br.readLine().split(" ");
            System.out.println((Integer.parseInt(entrada[0]) * (Integer.parseInt(entrada[1]) + 1))
                    + (Integer.parseInt(entrada[1]) * (Integer.parseInt(entrada[0]) + 1)));
        }
    }
}