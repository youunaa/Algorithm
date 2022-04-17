import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		// ["#####","# # #", "### #", "# ##", "#####"]
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			answer[i] = String.format("%" + n + "s", answer[i]);
		}

		// 벽"("#") 1 , "공백" 부분을 0
		for (int j = 0; j < n; j++) {
			String res = "";
			for (int t = 0; t < n; t++) {
				res += "1".equals(answer[j].substring(t, t + 1)) ? "#" : " ";
			}
			answer[j] = res;
		}
		
		return answer;
	}

}