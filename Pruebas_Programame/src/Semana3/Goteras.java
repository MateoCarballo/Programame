package Pruebas_Programame.src.Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.aceptaelreto.com/problem/statement.php?id=216&cat=9

public class Goteras {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        int entrada=0;
        int horas=0;
        int minutos=0;
        int segundos=0;
        for (int i = 0; i < casos; i++) {
            entrada=Integer.parseInt(br.readLine());
            horas=entrada/3600;
            entrada=entrada%3600;
            minutos=entrada/60;
            entrada=entrada%60;
            segundos= entrada;
            System.out.printf("%02d:%02d:%02d\n",horas,minutos,segundos);
        }
    }
}
