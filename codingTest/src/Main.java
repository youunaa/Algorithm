import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int N = 4;
        int K = 7;
        String[][] objects = {
                { "6", "13" },
                { "4", "8" },
                { "3", "6" },
                { "5", "12" },
        };
        excuete(N, K, objects);
    }

    /**
     * 
     * @param n      물품의 수
     * @param k      준서가 버틸 수 있는 무게
     * @param values 무게, 가치
     * @returns 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
     */
    private static void excuete(int n, int k, String[][] objects) {
        // 준서는 최대 k kg까지 밖에 못버팀..
        Map<Integer, Integer> obj = new HashMap<>();

        String[] m = new String[objects.length];
        int i = 0;

        for (String[] object : objects) {
            m[i] = object[0];
            obj.put(Integer.parseInt(object[0]), Integer.parseInt(object[1]));
            i++;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < m.length; j++) {
            int sum = 0;
            for (int t = 1; t < m.length; t++) {

                if (j != t) {
                    int m1 = Integer.parseInt(m[j]);
                    int m2 = Integer.parseInt(m[t]);
                    sum = m1 + m2;

                    if (sum <= k) {
                        // if (m2 != map.get(m1)) {
                        map.put(m1, m2);
                        // }
                    }
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int d : obj.keySet()) {
            int sum = 0;

            for (int s : map.keySet()) {
                sum = obj.get(map.get(s)) + obj.get(s);
                list.add(sum);
            }
        }
        int max = Collections.max(list);
        System.out.println(max); // 5
    }

}