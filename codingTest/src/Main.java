import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] board = {
				{ 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 3 },
				{ 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 }
		};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		solution(board, moves);
	}

	public static int solution(int[][] board, int[] moves) {
		int width = board[0].length;

		StringBuilder sb = new StringBuilder();

		for (int move : moves) {
			for (int j = 0; j < width; j++) {
				if (board[j][move - 1] != 0) {
					String addItem = String.valueOf(board[j][move - 1]);
					sb.append(addItem);
					board[j][move - 1] = 0;
					break;
				}
			}
		}

		int answer = 0;
		return answer;
	}

}