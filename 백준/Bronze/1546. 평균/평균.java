import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = Integer.parseInt(s); // 시험 본 과목의 개수 n 입력값
        s = br.readLine(); // 현재 성적 입력값

        String[] score = s.split(" "); // 현재 성적 배열

        // 성적 타입변경(double) 및 최댓값 구하기
        double[] num = new double[n];
        int i = 0;
        for (String s1 : score) {
            num[i] = Double.parseDouble(s1);
            i++;
        }
        Arrays.sort(num);
        double M = num[n - 1]; // 최댓값

        double sum = 0;
        for (double v : num) {
            sum += ((v / M) * 100); // 점수 조작식
        }

        System.out.println(sum/n);
    }

}