import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] num = s.split(" ");
        int sum = 0;

        for (String s1 : num) {
            sum += Integer.parseInt(s1);
        }

        System.out.println(sum);
    }

}