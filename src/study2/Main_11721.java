package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int i = s.length() / 10;
        for (int j = 0; j < i; j++) {
            System.out.println(s.substring(j * 10, j * 10 + 10));
        }

        if(s.length() % 10 != 0){
            System.out.println(s.substring(s.length() / 10 * 10, s.length() / 10 * 10 + s.length() % 10));
        }

    }
}
