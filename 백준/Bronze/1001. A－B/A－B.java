import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] str = s.split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println(A - B);
    }

}