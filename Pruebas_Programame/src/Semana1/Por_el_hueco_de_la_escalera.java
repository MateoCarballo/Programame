package Semana1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Por_el_hueco_de_la_escalera {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = br.readLine().split("\\s+");
            int res = Integer.parseInt(entrada[1]) * Integer.parseInt(entrada[2]) + Integer.parseInt(entrada[3]);
            System.out.println(res + " " + (res + (Integer.parseInt(entrada[0]) * Integer.parseInt(entrada[1]))));
        }
    }
}
