package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                String[] datos = br.readLine().split(" ");
                int tenemosCaso = Integer.parseInt(datos[0]);
                int min =Integer.parseInt(datos[1]);
                int max = Integer.parseInt(datos[2]);
                if(tenemosCaso > max){
                    tenemosCaso = max;
                }else if (tenemosCaso < min){
                    tenemosCaso = 0;
                }
                total += tenemosCaso;
            }
            int necesitamos  = Integer.parseInt(br.readLine());
            System.out.println(necesitamos - total);
        }
    }
}
