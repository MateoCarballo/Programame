package Semana2;

//https://www.aceptaelreto.com/problem/statement.php?id=337
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaAbuelaMaria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada1 = br.readLine().split(" ");
            String[] entrada2 = br.readLine().split(" ");
            int z = Integer.parseInt(entrada1[0]) + Integer.parseInt(entrada2[0]);
            for (int x = 0; x < entrada1.length; x++) {
                if (Integer.parseInt(entrada1[x]) + Integer.parseInt(entrada2[x]) != z) {
                    System.out.println("NO");
                    break;
                } else if (x == (entrada1.length - 1)) {
                    System.out.println("SI");
                }
            }
        }
    }
}
