package coding.test.math.soleve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve002 {

    public void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if(s != null) {
            String[] arr = s.split(" ");
            
            double A = Integer.parseInt(arr[0]);
            double B = Integer.parseInt(arr[1]);

            System.out.println(A/B);
        }
    }

    // 문자열 관련..
    public void execute2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        while((input = br.readLine()) != null) {
            String s = br.readLine();
            
            int N; int K; 
            String text = "";

            if(s.contains(" ")) {
                String[] str = s.split(" ");
                
                N = Integer.parseInt(str[0]); // 문자열 길이
                K = Integer.parseInt(str[1]); // 덧붙힐수 있는 문자의 개수
            } else {
                text = s;
            }
            /**
             * 1. 문자열에서 반복패턴을 찾는다 
             */
            System.out.println("문자열 : " + text);
        }
    }

}