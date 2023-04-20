package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoteriaPenaAtletica {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            br.readLine();
            int contador= 0 ;
            String[] numeros = br.readLine().split(" ");
            for (String numero: numeros) {
                if (Integer.parseInt(numero) % 2 == 0){contador++;}
            }
            System.out.println(contador);
        }
    }
}
