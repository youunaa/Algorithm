
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("5 50 50 70 80 100");
        list.add("7 100 95 90 80 70 60 50");
        list.add("3 70 90 80");
        list.add("3 70 90 81");
        list.add("9 100 99 98 97 96 95 94 93 91");

        excuete(list.size(), list);
    }

    /**
     * 수학 - 사칙연산
     * @param testcase 
     * @param list
     */
    public static void excuete(int testcase, List<String> list) {
        // 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
        for (String score : list) {
            String[] arr = score.split(" ");

            int stdntCnt = Integer.parseInt(arr[0]); // 학생수
            
            int sum =0;
            for (int i = 1; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);
                sum += num;
            }
            
            double avg = sum / stdntCnt; // 평균
            
            int count = 0;
            // 평균 넘는 사람들 체크 
            for (int i = 1; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);
                if(num > avg) {
                    count++;
                }
            }
            // n명 중에 m명은 몇 % 냐 소수점 3번째까지
            System.out.println(String.format("%.3f", (double) count / (double) stdntCnt * 100.0));;
        }
    }
}