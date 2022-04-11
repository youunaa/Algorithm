import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Integer[][] dp;
    static int[] W; // weight
    static int[] V; // value

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        W = new int[N];
        V = new int[N];

        dp = new Integer[N][K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        test(K, W, V);
    }

    private static void test(int k, int[] w2, int[] v2) {
        Map<Integer, Integer> obj = new HashMap<>();

        String[] m = new String[w2.length];

        int i = 0;
        for (int w : w2) {
            m[i] = String.valueOf(w);
            obj.put(w, v2[i]);
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