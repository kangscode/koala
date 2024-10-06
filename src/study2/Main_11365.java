package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if(s.equals("END")) break;
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }

    }
}
