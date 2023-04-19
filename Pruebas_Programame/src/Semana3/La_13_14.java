package Pruebas_Programame.src.Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.aceptaelreto.com/problem/statement.php?id=370&cat=8
public class La_13_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = br.readLine().split("-");
            Arrays.sort(entrada);
            System.out.println((Integer.parseInt(entrada[0]) % 2 == 1 || Math.abs(Integer.parseInt(entrada[0]) - Integer.parseInt(entrada[1])) != 1)?"NO":"SI");
        }
    }
}