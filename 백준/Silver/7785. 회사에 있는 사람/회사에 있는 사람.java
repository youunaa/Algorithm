import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 이름, 출퇴근정보
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String info = br.readLine();
            String[] str = info.split(" ");
            map.put(str[0], str[1]);
        }

        // 회사에 남은 사람 목록
        List<String> member = new ArrayList<>();

        for (String name : map.keySet()) {
            // 퇴근이력이 없는 경우
            if (map.get(name).equals("enter")) {
                member.add(name); // 이름 추가
            }
        }

        // 사전의 역순 정렬
        Collections.sort(member, Collections.reverseOrder());

        for (String s : member) {
            System.out.println(s);
        }
    }

}