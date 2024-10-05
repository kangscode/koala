package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15917 {
    public static void main(String[] args) throws IOException {

        //BufferedReader를 사용하여 입력을 더 빠르게 처리합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(br.readLine());
//            n이 2의 거듭제곱일 경우, 이진수 표현에서 1이 하나만 존재하고 나머지는 0입니다. 예를 들어, 4는 100, 8은 1000입니다.
//            n - 1을 하면, 이 1 비트가 0으로 바뀌고 그 오른쪽의 모든 비트가 1로 바뀝니다. 예를 들어, 4의 경우 3이 되어 011이 됩니다.
//            따라서 n & (n - 1)을 수행하면, 2의 거듭제곱인 경우에는 결과가 0이 됩니다.
            if ((a & (a - 1)) == 0) System.out.println(1);
            else System.out.println(0);
        }
    }

}
