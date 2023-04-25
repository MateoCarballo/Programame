package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String slogan = br.readLine();
            int contMayus = 0;
           int contMinus = 0;
            for (int j = 0; j < slogan.length(); j++) {
                if(Character.isUpperCase(slogan.charAt(j))){
                    contMayus++;
                }else if(Character.isLowerCase(slogan.charAt(j))){
                    contMinus++;
                }
            }
            System.out.println((contMayus>contMinus)?slogan.toUpperCase():slogan.toLowerCase());
        }
    }
}
