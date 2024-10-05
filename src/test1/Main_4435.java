package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4435 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] g = {1, 2, 3, 3, 4, 10};
        int[] s = {1, 2, 2, 2, 3, 5, 10};

        int count = Integer.parseInt(br.readLine());

        for (int j = 0; j < count; j++) {

            int result1 = 0;
            int result2 = 0;

            String inputLine1 = br.readLine();
            String[] inputStrings1 = inputLine1.split(" "); // 공백으로 분리

            for(int i = 0; i < g.length; i++) {
                result1 += g[i] * Integer.parseInt(inputStrings1[i]);
            }


            String inputLine2 = br.readLine();
            String[] inputStrings2 = inputLine2.split(" "); // 공백으로 분리

            for(int i = 0; i < s.length; i++) {
                result2 += s[i] * Integer.parseInt(inputStrings2[i]);
            }

            if(result1 > result2) {
                System.out.println("Battle " + (j+1) + ": Good triumphs over Evil");
            }
            else if(result2 > result1) {
                System.out.println("Battle " + (j+1) + ": Evil eradicates all trace of Good");
            }
            else {
                System.out.println("Battle " + (j+1) + ": No victor on this battle field");
            }

        }


    }
}
