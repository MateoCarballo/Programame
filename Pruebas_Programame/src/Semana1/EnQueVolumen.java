package Semana1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnQueVolumen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            System.out.println(Integer.parseInt(br.readLine()) / 100);
        }
    }
}
