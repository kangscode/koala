package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1267 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        int y = 0;
        int m = 0;
        for(String e: s) {
            int i = Integer.parseInt(e);
            y += (i / 30 + 1) * 10;
            m += (i / 60 + 1) * 15;
        }
        if (y > m) System.out.println("M " + m);
        else if(y < m) System.out.println("Y " + y);
        else System.out.println("Y M " + y);
    }
}
