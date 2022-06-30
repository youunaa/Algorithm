import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 오늘 하루 동안 팔린 책의 개수 N

        // 책제목, 판매 수
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 1) + 1);
        }

        // 가장 많이 팔린 책의 수
        Integer max = Collections.max(map.values());

        // 베스트 셀러 목록
        ArrayList<String> bestSeller = new ArrayList<String>(map.keySet());
        Collections.sort(bestSeller);
        for (String book : bestSeller) {
            if (map.get(book) == max) {
                System.out.println(book);
                break;
            }
        }
    }

}