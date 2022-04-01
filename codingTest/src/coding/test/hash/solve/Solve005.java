package coding.test.hash.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Iterator;

public class Solve005 {

    public void execute() {
        String[] genres = { "classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 600, 150, 800, 2500 };

        solution(genres, plays);
    }

    /**
     * 해시 - 베스트앨범
     * 
     * @param genres
     * @param plays
     * @return [4, 1, 3, 0]
     */
    public int[] solution(String[] genres, int[] plays) {
        /**
         * 1. 제일 많이 재생된 장르
         * 2. 같은 장르에서 다음으로 많이 재생된 index
         * 3. 두개 묶고
         * 4. 다음장르에서 가장 많이 재생된 두개 index
         */
        int index = maxIndex(plays);
        String maxGenre = genres[index];
        plays[index] = 0;

        Map<Integer, String> map = new HashMap<>();
        List<Map<Integer, String>> list = new ArrayList<>();

        int j = 0;
        for (String genre : genres) {
            map.put(plays[j], genre);
            j++;
        }

        for (int key : map.keySet()) {
            Map<Integer, String> map2 = new HashMap<>();
            map2.put(key, map.get(key));
            list.add(map2);
        }

        int[] answer = {};

        return answer;
    }

    public int maxIndex(int[] plays) {
        // 최대값, 최대값의 인덱스 초기값 세팅
        int max = plays[0];
        int maxIndex = 0;

        // 최대값, 최대값의 인덱스 구하기
        for (int i = 0; i < plays.length; i++) {
            if (plays[i] > max) {
                max = plays[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}