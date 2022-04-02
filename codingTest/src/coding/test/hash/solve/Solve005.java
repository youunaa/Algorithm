package coding.test.hash.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;
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
        // System.out.println("--------------------------------");
        // List<Integer> keyLists = new ArrayList<>(hs.keySet());
        // keyLists.sort((s1, s2) -> hs.get(s2).compareTo(hs.get(s1)));

        // Collections.sort(genres, (o1, o2) -> map.get(o2) - map.get(o1));

        return plays;
    }

}