package src.coding.test.bruteforce.resolve;


import src.coding.test.time.Timer;

public class Resolve004 extends Timer {

    public void execute() {
        super.execute();

        int brown = 8;
        int yellow = 1;

        solution(brown, yellow);
        
        super.clear();
    }

    /**
     * 완전탐색 - 카펫
     * 10, 2 => [4, 3]
     * 8, 1 => [3, 3]
     * 24, 24 => [8, 6]
     * @param brown 카펫에서 갈색 격자의 수
     * @param yellow 카펫에서 노란색 격자의 수
     * @return 카펫의 가로, 세로 크기를 순서대로 담은 배열 
     * brown은 8 이상 5,000 이하인 자연수입니다.
     * yellow는 1 이상 2,000,000 이하인 자연수입니다.
     * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
     */
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];

        int sum = brown + yellow;
        for (int y = 3; y <= Math.sqrt(brown + yellow); y++) {
            if (sum % y == 0) {
                int x = sum / y;
                if ((x - 2) * (y - 2) == yellow) {
                    result[0] = x;
                    result[1] = y;
                    break;
                }
            }
        }
        return result;
    }

    public int[] solution2(int brown, int yellow) {
        int[] answer = new int[2];
 
        int area = brown + yellow; // 전체 격자 개수
 
        for (int i = 1; i <= area; i++) {
            int row = i; // 세로
            int col = area / row; // 가로
 
            // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다.
            if (row > col)
                continue;
 
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
 
        }
        return answer;
    }
    // 일단 가로 세로의 길이부터 확인해보면 됩니다. 
    // 가로의 블럭 갯수와 세로의 블럭 갯수는 겹치는 부분이 모서리의 4개이므로 
    // 전체 brown의 갯수는 "2x + 2y - 4" 입니다.

    // 그리고 가로축이 세로축보다 크거나 같다고 했으므로 
    // 세로축을 작은 숫자부터 증가시키면서 가로축의 길이를 산정하면 됩니다. 
    // red가 최소 1개가 있기 때문에 세로 블럭은 3개 미만이 될 수 없어 3부터 시작합니다. 

    // 그리고 red의 갯수는 (x-2) * (y-2)이기 때문에 
    // 산정된 가로 세로 블럭 수에서 계산된 red 갯수와, 
    // 주어진 red 갯수를 비교해 같을 때는 찾으면 됩니다.
}