package coding.test.resolve;

import coding.test.time.Timer;

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
        
        // 어떤 사람은 가로를 증가시키면 가능한 빨간색 카펫이 1개 증가하고,
        // 세로를 증가시키면 2배로 증가하는 특징을 이용해서 풀었고, 어떤 사람은 위처럼 사각형의 특징을 이용해 풀었다.

        // 가로 길이는 세로 길이와 모든 타일의 개수에 따라 결정된다. 
        // 예를 들어 6 * 4 격자 모양의 모든 타일의 개수는 12개이며 가로 길이 6은 12를 세로 길이 4로 나눈 값이 된다.

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

}