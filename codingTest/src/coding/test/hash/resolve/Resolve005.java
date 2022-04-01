package coding.test.hash.resolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Resolve005 {

    public void execute() {
        System.out.println("???????????????????");
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
        Map<String, Integer> map = new HashMap<>();

        int j = 0;
        for (String genre : genres) {
            System.out.println("genre");
            map.put(genre, plays[j]);
            j++;
        }

        // for (String key : map.keySet()) {
        //     String value = map.get(key);
        // }

        int[] answer = {};

        return answer;
    }

}