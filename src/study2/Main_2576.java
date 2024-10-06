package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 100;
        int result = 0;
        for (int i = 0; i < 7; i++) {
            int x = Integer.parseInt(br.readLine());


            if (x % 2 == 1) {
                if (min > x) min = x;
                result += x;
            }

        }

        if(result == 0) System.out.println(-1);
        else System.out.println(result + "\n" + min);

    }
}
