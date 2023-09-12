import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 자연수 N

        int startIndex = 1;
        int endIndex = 1;
        int count = 1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (endIndex < N) {
            int sum = 0;

            for (int i = startIndex; i <= endIndex; i++) {
                sum = sum + i;
            }

            if(sum < N) {
                endIndex++;
            } else if (sum == N) {
                count++;
                endIndex++;
            } else if (sum > N) {
                startIndex++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }

}