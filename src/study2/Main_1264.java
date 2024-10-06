package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1264 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine().toLowerCase();
            if(s.equals("#")) break;
            int result = 0;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') result += 1;
            }
            System.out.println(result);
        }
    }
}
