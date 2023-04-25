package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Prueba4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        ArrayList<String> clientes = new ArrayList<>();
        for (int i = 0; i < casos; i++) {
            clientes.add(br.readLine());
            clientes.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] o1Separado = o1.split(" ");
                    String[] o2Separado = o1.split(" ");
                    if (Integer.parseInt(o1Separado[0]) > 60) {
                        if (Integer.parseInt(o2Separado[0]) <= 60) {
                            return 0;
                        }
                        if (Integer.parseInt(o1Separado[1]) != Integer.parseInt(o2Separado[1])) {
                            if (Integer.parseInt(o1Separado[1]) == 1) {
                                return 0;
                            } else {
                                return 1;
                            }
                        } else {
                            if (Integer.parseInt(o1Separado[0]) > Integer.parseInt(o2Separado[0])) {
                                return 0;
                            } else if (Integer.parseInt(o1Separado[0]) < Integer.parseInt(o2Separado[0])) {
                                return 1;
                            } else {
                                if (Integer.parseInt(o1Separado[2]) > Integer.parseInt(o2Separado[2])) {
                                    return 1;
                                } else if (Integer.parseInt(o1Separado[2]) < Integer.parseInt(o2Separado[2])) {
                                    return 0;
                                }
                            }
                        }

                    }
                    if (Integer.parseInt(o1Separado[0]) > 60) {

                    }
                }
                return 0;
                });
            }
        }
    }
