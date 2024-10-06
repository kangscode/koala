package study2;

import java.io.*;
import java.util.HashMap;

public class Main_17219 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            map.put(s1[0], s1[1]); // 첫 번째 요소를 키로, 두 번째 요소를 값으로 저장
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            String s2 = map.get(s1);
            bw.write(s2 + "\n");
        }

        bw.flush();
        br.close(); //BufferedWriter 닫기
    }
}
