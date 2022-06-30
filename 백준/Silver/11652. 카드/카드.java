import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 정수, 갯수
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxVal = Collections.max(map.values());

        ArrayList<Long> sortList = new ArrayList<Long>(map.keySet());
        Collections.sort(sortList);

        for (Long a : sortList) {
            if (map.get(a) == maxVal) {
                System.out.println(a);
                break;
            }
        }

    }

}