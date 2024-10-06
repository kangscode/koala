package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄로 입력받기
        String[] inputStrings = br.readLine().split(" ");

        //주어지는 자연수의 범위가 크기 때문에 long으로 선언하지 않으면 런타임에러 판정이 난다.
        long a = Long.parseLong((inputStrings[0] + inputStrings[1]));
        long b = Long.parseLong((inputStrings[2] + inputStrings[3]));

        System.out.println(a + b);

    }
}
