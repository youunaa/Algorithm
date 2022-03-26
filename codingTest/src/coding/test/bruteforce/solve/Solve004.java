package coding.test.bruteforce.solve;

import coding.test.time.Timer;

public class Solve004 extends Timer {

    public void execute() {
        super.execute();
        
        int brown = 10;
        int yellow = 2;

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
     */
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        return answer;
    }

}