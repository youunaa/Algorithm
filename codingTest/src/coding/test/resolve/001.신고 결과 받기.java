package coding.test.resolve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Resolve001 {
    
    public void execute() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"}; 
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; 
        int k = 2;

        solution(id_list, report, k);
    }

    /**
     * 해시 알고리즘
     * @param id_list
     * @param report
     * @param k
     * @return
     */
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }
    
}