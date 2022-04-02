package coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solve005 {

    static int n;
    static List<BaseBallData> inputData = new ArrayList<>();

    public void execute() throws IOException {
        System.out.println("입력하세요");

        Scanner scanner = new Scanner(System.in);
        int a;

        a = scanner.nextInt();

        System.out.println("입력 " + a);

        for (int i = 0; i < n; i++) {
            // s = br.readLine();
            // System.out.println(s);
            // StringTokenizer st = new StringTokenizer(s, " ");

            // System.out.println(">"+ st.nextToken());
            // int data = Integer.parseInt(st.nextToken());
            // int strike = Integer.parseInt(st.nextToken());
            // int ball = Integer.parseInt(st.nextToken());

            // BaseBallData baseBallData = new BaseBallData(data, strike, ball);
            // inputData.add(baseBallData);
        }

        solution(inputData);
    }
    /**
     * 완전탐색 - 숫자 야구
     * @param ask 민혁이가 영수에게 어떤 수들을 물어보았는지
     * @param answer 영수가 어떤 대답
     * @return 민혁이의 물음들과 각각의 물음에 대한 영수의 답이 입력으로 주어질 때 
     * 영수가 생각하고 있을 가능성이 있는 답의 총 개수를 출력하는 프로그램을 작성하시오.
     * 
     */
    public int solution(List<BaseBallData> baseBallData) {
        for(BaseBallData baseball : baseBallData) {
        }

        int answer = 0;
        
        return answer;
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