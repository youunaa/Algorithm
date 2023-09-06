package src;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String numStr = br.readLine();

        /**
         * 1. n만큼 배열 지정
         * 2. 배열끼리 합친다 sum 함수 사용
         */
        long[] longArray = Arrays.stream(numStr.split(""))
                .mapToLong(Long::parseLong)
                .toArray();

        long sum = Arrays.stream(longArray).sum();
        System.out.println(sum);
    }

}