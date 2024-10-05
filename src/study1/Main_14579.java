package study1;

import java.util.Scanner;

public class Main_14579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long result = 1;

        for (int i = a; i <= b; i++) {
            int sum = i * (i + 1) / 2; // 합을 효율적으로 계산
            /*for(int j = 1; j <= i; j++) {
                sum += j;
            }*/

//            각 합을 result에 곱하고, 매번 14579로 나눈 나머지를 저장하여 오버플로우를 방지합니다.
            result = (result * sum) % 14579;

        }
        System.out.println(result);
    }
}
