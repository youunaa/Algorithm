package src.coding.test.hash.solve;

import java.util.HashMap;
import java.util.Iterator;

public class Solve004 {

    public void execute() {
        String[][] clothes = {
                { "yellowhat", "headgear" },
                { "bluesunglasses", "eyewear" },
                { "green_turban", "headgear" },
                { "crowmask", "face" },
                { "bluesunglasses", "face" },
                { "smoky_makeup", "face" }
        };
        solution(clothes);
    }

    /**
     * 해시 - 위장
     * @param phone_book
     * @return
     */
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        int answer = 1;
        Iterator<Integer> values = map.values().iterator();
        while(values.hasNext()) {
            answer *= values.next().intValue() + 1;
        }
        return answer - 1;
    }

}