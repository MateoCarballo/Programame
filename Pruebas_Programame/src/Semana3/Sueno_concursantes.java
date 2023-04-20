package Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.aceptaelreto.com/problem/statement.php?id=184&cat=9
public class Sueno_concursantes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int casos = Integer.parseInt(br.readLine());
            if (casos == 0) {
                break;
            }
            int minutos = 0;
            for (int i = 0; i < casos; i++) {
                String[] entrada = br.readLine().split("-");
                String[] dormir = entrada[0].split(":");
                String[] despertar = entrada[1].split(":");
                if (dormir[0].charAt(0) == '2') {
                    minutos += ((23 - Integer.parseInt(dormir[0])) * 60) + (60 - Integer.parseInt(dormir[1]));
                    minutos += ((Integer.parseInt(despertar[0])) * 60) + (Integer.parseInt(despertar[1]));
                } else {
                    minutos += ((Integer.parseInt(despertar[0]) - Integer.parseInt(dormir[0])) * 60)
                            + (Integer.parseInt(despertar[1]) - Integer.parseInt(dormir[1]));
                }
            }
            System.out.printf("%02d:%02d", minutos / 60, minutos % 60);
        }
    }
}