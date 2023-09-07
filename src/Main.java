package src;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\n");

        bw.flush();
        bw.close();
    }

}