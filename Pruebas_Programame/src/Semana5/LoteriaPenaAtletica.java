package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoteriaPenaAtletica {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            int limite = Integer.parseInt(br.readLine());
            int contador= 0 ;
            String[] numeros = br.readLine().split(" ");
            for (int x = 0 ; x < limite ; x++) {
                if (Integer.parseInt(numeros[x]) % 2 == 0){contador++;}
            } 
            System.out.println(contador);
        }
    }
}
