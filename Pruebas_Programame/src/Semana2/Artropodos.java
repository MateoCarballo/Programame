package Pruebas_Programame.src.Semana2;

//https://www.aceptaelreto.com/problem/statement.php?id=293
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Artropodos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = new String[5];
            entrada = br.readLine().split("\\s+");
            int res = (Integer.parseInt(entrada[0]) * 6) +
                    (Integer.parseInt(entrada[1]) * 8) + (Integer.parseInt(entrada[2]) * 10)
                    + (Integer.parseInt(entrada[3]) * (Integer.parseInt(entrada[4]) * 2));
            System.out.println(res);
        }
    }
}