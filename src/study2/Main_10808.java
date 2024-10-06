package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] alp = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alp[c - 'a']++; // 아스키코드 값 이용
        }

        for(int i : alp) {
            System.out.print(i + " ");
        }

    }
}
