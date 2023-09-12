import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료 N 가지
        int M = Integer.parseInt(br.readLine()); // 고유번호 M
        int[] n = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int startIndex = 0;
        int endIndex = 1;
        int count = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (endIndex < N) {
            int sum = n[startIndex] + n[endIndex];

            if (sum < M) {
                if (endIndex == N-1) {
                    startIndex++;
                    endIndex = startIndex + 1;
                } else {
                    endIndex++;
                }
            } else if (sum == M) {
                count++;
                startIndex++;
                endIndex = startIndex + 1;
            } else if (sum > M) {
                startIndex++;
                endIndex = startIndex + 1;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }

}