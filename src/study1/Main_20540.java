package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_20540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String me = br.readLine();

        for (int i = 0; i < me.length(); i++) {
            if(i == 0) {
                if (me.charAt(i) == 'E') System.out.print('I');
                else System.out.print('E');
            }
            else if(i == 1) {
                if (me.charAt(i) == 'S') System.out.print('N');
                else System.out.print('S');
            }
            else if(i == 2) {
                if (me.charAt(i) == 'F') System.out.print('T');
                else System.out.print('F');
            }
            else if(i == 3) {
                if (me.charAt(i) == 'J') System.out.print('P');
                else System.out.print('J');
            }

        }
    }
}
