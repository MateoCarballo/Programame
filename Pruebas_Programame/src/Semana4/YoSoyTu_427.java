package Semana4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YoSoyTu_427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String entrada1 = br.readLine();
            String entrada2 = br.readLine();
            System.out.println((entrada1.equals("Luke") && entrada2.equals("padre"))
                    ? "TOP SECRET"
                    : entrada1 + ", yo soy tu " + entrada2);
        }
    }
}
