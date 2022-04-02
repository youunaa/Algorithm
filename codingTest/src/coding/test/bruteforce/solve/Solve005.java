package coding.test.bruteforce.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Solve005 {

    static int n;
    static List<BaseBallData> inputData = new ArrayList<>();

    public void execute() throws IOException {
        System.out.println("입력하세요");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            System.out.println(s);
            StringTokenizer st = new StringTokenizer(s, " ");
            int data = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            BaseBallData baseBallData = new BaseBallData(data, strike, ball);
            inputData.add(baseBallData);
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
        // 민혁이가 말한 세 자리 수에 있는 숫자들 중 하나가 영수의 세 자리 수의 동일한 자리에 위치하면 스트라이크 한 번으로 센다. 
        // 숫자가 영수의 세 자리 수에 있긴 하나 다른 자리에 위치하면 볼 한 번으로 센다.

        // 민혁이가 영수의 세 자리 수를 정확하게 맞추어 3 스트라이크가 되면 게임이 끝난다. 
        // 아니라면 민혁이는 새로운 수를 생각해 다시 영수에게 묻는다.

        int answer = 0;
        
        return answer;
    }

    static class BaseBallData {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();
        // n = Integer.parseInt(s);
        
        // for (int i = 0; i < n; i++) {
        //     StringTokenizer st = new StringTokenizer(br.readLine());
            
        //     long value = Long.parseLong(st.nextToken());
        //     System.out.println(value);

            // String type = st.nextToken(); // 집의 개수 n, 철수가 놀이를 할 횟수 q
            // String prices = st.nextToken(); // n개의 집의 대문에 쓰여 있는 수 a 가 공백을 사이에 두고 순서
            // String[] str = type.split(" ");
            // int N = Integer.parseInt(str[0]);

            // for (int j = 2; j < N + 1; j++) {
                // String test = st.nextToken();
                // }
            // }
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