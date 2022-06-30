import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int aCnt = Integer.parseInt(st.nextToken());
        int bCnt = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " "); // A집합
        for (int i = 0; i < aCnt; i++) {
            int aVal = Integer.parseInt(st.nextToken());
            map.put(aVal, 0);
        }

        st = new StringTokenizer(br.readLine(), " "); // B집합
        for (int j = 0; j < bCnt; j++) {
            int bVal = Integer.parseInt(st.nextToken());
            if (!map.containsKey(bVal)) {
                // 중복되지 않는경우 원소 추가
                map.put(bVal, 0);
            } else {
                // 중복되는 원소 제거
                map.remove(bVal, 0);
            }
        }

        System.out.println(map.size());
    }

}