import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사이트 개수, 찾아야하는 비밀번호
        String[] siteInfo = br.readLine().split(" ");

        int N = Integer.parseInt(siteInfo[0]);
        int M = Integer.parseInt(siteInfo[1]);

        HashMap<String, String> map = new HashMap<>();

        // N만큼 입력받기
        for (int i = 0; i < N; i++) {
            String[] sitePwd = br.readLine().split(" ");
            // key 는 사이트 url, value는 패스워드
            map.put(sitePwd[0], sitePwd[1]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // M만큼 돌려서 value 찾기
        for (int j = 0; j < M; j++) {
            String key = br.readLine();
            bw.write(map.get(key) + "\n");
        }

        bw.flush();
        bw.close();
    }

}