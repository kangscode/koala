package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_23739 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        int min = 30;

        for (int i = 0; i < n; i++) {
            if (t[i] < min) {
                result += 1;
                min = min-t[i];
            }
            else {
                if (t[i] / 2.0 <= min) result += 1; //2.0은 소수로 해야 함.
                min = 30;
            }
        }

        System.out.println(result);

    }
}
