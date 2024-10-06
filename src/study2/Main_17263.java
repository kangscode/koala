package study2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main_17263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(s[i]));
        }
        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(list.get(n - 1));
        //list.get(n - 1)은 Integer 타입이므로,
        // write 메서드는 String 타입을 요구하므로 이를 String.valueOf()를 사용하여 변환해 줘야 합니다.
        bw.write(String.valueOf(list.get(n - 1)));

        bw.flush();
        bw.close();
    }
}
