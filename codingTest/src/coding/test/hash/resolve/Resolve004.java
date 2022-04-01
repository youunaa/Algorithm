package coding.test.hash.resolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Resolve004 {

    public void execute() {

        String[][] clothes = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
                { "green_turban", "headgear" } };
        String[][] clothes2 = { { "crowmask", "face" }, { "bluesunglasses", "face" }, { "smoky_makeup", "face" } };

        // headgear에 해당하는 의상이
        // yellow_hat, green_turban이고 eyewear에
        // 해당하는 의상이 blue_sunglasses이므로 아래와 같이 5개의 조합이 가능합니다.

        // 1. yellow_hat
        // 2. blue_sunglasses
        // 3. green_turban
        // 4. yellow_hat + blue_sunglasses
        // 5. green_turban + blue_sunglasses

        solution(clothes);
    }

    /**
     * 해시 - 전화번호 목록
     * 
     * @param phone_book
     * @return
     */
    public int solution(String[][] clothes) {
        // 한가지씩 입는경우
        // 조합해서 입는경우
        // ** 안입는 경우를 빼야한다.
        int m = clothes.length;
        int n = clothes[0].length;
        Map<String, Integer> map = new HashMap<>();
        
        // 중복되는 종류의 갯수를 count
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String str = clothes[i][j] + " ";
                String[] strArr = str.split(" ");
                String type = strArr[1];

                map.put(type, map.getOrDefault(type, 0) + 1);
            }
        }

        System.out.println(map);

        int answer = 0;
        return answer;

    }

    public int solution2(String[][] clothes) {
        // 한가지씩 입는경우
        // 조합해서 입는경우
        // ** 안입는 경우를 빼야한다.
        int m = clothes.length;
        int n = clothes[0].length;
        Map<String, Integer> map = new HashMap<>();
        
        // 중복되는 종류의 갯수를 count
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String str = clothes[i][j] + " ";
                String[] strArr = str.split(" ");
                String type = strArr[1];

                map.put(type, map.getOrDefault(type, 0) + 1);
            }
        }

        System.out.println(map);

        int answer = 0;
        return answer;

    }
}