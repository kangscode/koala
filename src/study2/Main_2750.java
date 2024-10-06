package study2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       ArrayList<Integer> list = new ArrayList<Integer>();

       for (int i = 0; i < n; i++) {
           list.add(Integer.parseInt(br.readLine()));
       }

        Collections.sort(list);

       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer i : list) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
