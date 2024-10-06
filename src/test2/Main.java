package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);


        if (a + b + c < 100) {
            if (a < b && a < c) System.out.println("Soongsil");
            else if (b < c && b < a) System.out.println("Korea");
            else System.out.println("Hanyang");
        }
        else System.out.println("OK");
    }
}
