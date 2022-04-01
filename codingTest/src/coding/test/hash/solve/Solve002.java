package coding.test.hash.solve;

import java.util.HashMap;
import java.util.Map;

public class Solve002 {

    public void execute() {
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav" };

        solution(participant, completion);
    }

    /**
     * 해시 - 완주하지 못한 선수
     * @param participant 참가자 목록
     * @param completion  완주한 선수 목록
     * @return 완주하지 못한 한명의 선수
     */
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

}