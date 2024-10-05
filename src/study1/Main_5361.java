package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5361 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] values = {350.34, 230.90, 190.55, 125.30, 180.90};

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            double result = 0;

            // 한 줄로 입력받기
            String inputLine = br.readLine();
            String[] inputStrings = inputLine.split(" "); // 공백으로 분리

            // 각 상품에 대해 수량을 입력받고 총 금액을 계산
            for (int j = 0; j < inputStrings.length; j++) {
                result += values[j] * Double.parseDouble(inputStrings[j]);
            }
            System.out.printf("$%.2f\n", result); // 소수점 둘째 자리까지 출력

        }
    }
}
