package test2;

import java.io.IOException;


public class Main_4673 {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i <= 10000; i++) {

            boolean flag = true;
            for (int j = 0; j <= i; j++) {
                int result = j;
                String s = String.valueOf(j);
                for (int k = 0; k < s.length(); k++) {
                    result += s.charAt(k) - '0'; //s.charAt(k) - '0'는 Java에서 문자(char)를 정수(int)로 변환하는 일반적인 방법
                }
                if (result == i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }

        }



    }
}
