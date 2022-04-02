import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static int n;
    static List<BaseBallData> inputData = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        System.out.println("입력하세요");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            System.out.println(s);
            StringTokenizer st = new StringTokenizer(s, " ");

            int type = Integer.parseInt(st.nextToken()); // 종류 n가지
            int prices = Integer.parseInt(st.nextToken()); // 물약의 가격 $c_i$가 공백을 사이에
            int discountCnt = Integer.parseInt(st.nextToken()); // 물약 할인 정보가 N개

            int discountinfo1 = Integer.parseInt(st.nextToken()); // 물약 할인 정보가 N개
            int discountinfo2 = Integer.parseInt(st.nextToken()); // 물약 할인 정보가 N개

            int medicineNum = Integer.parseInt(st.nextToken()); // 물약 번호 
            int discount = Integer.parseInt(st.nextToken()); // 할인되는 가격

            BaseBallData baseBallData = new BaseBallData(data, strike, ball);
            inputData.add(baseBallData);
        }

        execute(N);
    }

    static class BaseBallData {
        int data;
        int strike;
        int ball;

        public BaseBallData(int data, int strike, int ball) {
            this.data = data;
            this.strike = strike;
            this.ball = ball;
        }
    }

}