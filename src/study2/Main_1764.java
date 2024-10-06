package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main_1764{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>(); // HashSet으로 변경

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }


        int result = 0;
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            if (set.contains(s1)) { // HashSet에서 검색
                result += 1;
                results.add(s1);
            }
        }

        Collections.sort(results);

        StringBuilder sb = new StringBuilder();
        for (String i : results) {
            sb.append(i).append("\n");
        }

        System.out.println(result);
        System.out.println(sb);


    }
}
