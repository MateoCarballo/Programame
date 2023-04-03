package Pruebas_Programame.src.Semana2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LaAbuelaMaria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());

        for (int i = 0; i < casos; i++) {

            String[] entrada1 = new String[6];
            String[] entrada2 = new String[6];

            entrada1 = br.readLine().split("\\s+");
            entrada2 = br.readLine().split("\\s+");

            for (int j = 0; j < entrada1.length; j++) {

                for (int j2 = entrada2.length - 1; j2 >= 0; j2--) {

                    if (Integer.parseInt(entrada1[j]) == Integer.parseInt(entrada2[j2])) {
                        System.out.println("si");
                    }
                }
            }

        }
    }

}
