package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main_10867 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        String[] split = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            set.add(Integer.parseInt(split[i])); //중복 제거
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list); //정렬

        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
