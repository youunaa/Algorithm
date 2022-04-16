import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		solution(id_list, report, k);
	}

	/**
	 * 
	 * @param id_list
	 * @param report
	 * @param k
	 * @return [2,1,1,0]
	 */
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];

		HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
		String[] resultArr = hashSet.toArray(new String[0]);

		String[][] result = new String[resultArr.length][2];

		int i = 0;
		// 신고자 - 신고당한사람 레포트
		for (String user : resultArr) {
			String[] user1 = user.split(" ");
			result[i][0] = user1[0];
			result[i][1] = user1[1];
			i++;
		}

		Map<String, Integer> map = new HashMap<>();

		for (int j = 0; j < i; j++) {
			map.put(result[j][1], map.getOrDefault(result[j][1], 0) + 1);
		}

		List<String> list = new ArrayList<>();

		// 정지당할 회원 목록
		for (String key : map.keySet()) {
			if (map.get(key) >= k) {
				list.add(key);
			}
		}

		Map<String, Integer> idMap = new HashMap<>();

		for (String name : id_list) {
			idMap.put(name, 0);
		}

		for (int t = 0; t < i; t++) {
			// tt는 정지당한사람
			if (list.indexOf(result[t][1]) > -1) {
				idMap.put(result[t][0], idMap.getOrDefault(result[t][0], 0) + 1);
			}
		}
		int f =0;
		for(String nn : id_list) {
			answer[f] = idMap.get(nn);
			f++;
		}

		return answer;
	}
}