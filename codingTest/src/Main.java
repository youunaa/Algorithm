import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 46, 33, 33 ,22, 31, 50 };
		int[] arr2 = { 27 ,56, 19, 14, 14, 10};

		// ["#####","# # #", "### #", "# ##", "#####"]
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		int[][] map1 = new int[n][n];
		int[][] map2 = new int[n][n];

		for (int i = 0; i < n; i++) {
			String binaryStr1 = Integer.toBinaryString(arr1[i]);
			String binaryStr2 = Integer.toBinaryString(arr2[i]);

			if (binaryStr1.length() != n) {
				binaryStr1 = String.format("%0"+n+"d", Integer.parseInt(binaryStr1));
			}
			if (binaryStr2.length() != n) {
				binaryStr2 = String.format("%0"+n+"d", Integer.parseInt(binaryStr2));
			}

			for (int k = 0; k < n; k++) {
				map1[i][k] = Integer.parseInt(binaryStr1.substring(k, k + 1));
				map2[i][k] = Integer.parseInt(binaryStr2.substring(k, k + 1));
			}
		}
		String[] answer = new String[n];

		// 벽"("#") 1 , "공백" 부분을 0
		for (int j = 0; j < n; j++) {
			String res = "";
			for (int t = 0; t < n; t++) {
				res += (map1[j][t] == 1 || map2[j][t] == 1) ? "#" : " ";
			}
			answer[j] = res;
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}

}