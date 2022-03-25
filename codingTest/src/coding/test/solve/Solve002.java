package coding.test.solve;

import java.util.ArrayList;

class Solve002 {

    public void execute() {
        int[] answers = {1,2,3,4,5,3,2,4,2,5,9,1,2}; 
        
        solution(answers);
    }
    /**
     * 완전탐색 - 모의고사
     * @param answers : 정답 최대 1000문제
     * @return 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     */
    public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Integer> answers1 = getAnswers(pattern1, answers.length);
        ArrayList<Integer> answers2 = getAnswers(pattern2, answers.length);
        ArrayList<Integer> answers3 = getAnswers(pattern3, answers.length);

        // 2. 답안지와, 정답지를 같은 index로 비교한다. 
        // 3. 문제를 맞춘 경우 count를 한다
        // 4. 위의 과정을 세번 반복한 후 count를 비교한다.
        // 5. 아무것도 맞추지 못한 학생은 포함 하지 않은다.
        // 6. 가장 높은 점수를 받은 사람이 여럿이라면 학생순으로 (1,2,3)으로 나열한다.
        int[] answer = {};
        return answer;
    }

    // 1. 문제 길이만큼 학생1의 답안지를 만든다.
    public ArrayList<Integer> getAnswers(int[] pattern, int answerSize) {
        ArrayList<Integer> result = new ArrayList<Integer>(); 

        int index = 0;
        while(index < answerSize) {
            for(int j=0; j < pattern.length; j++) {
                result.add(index, pattern[j]);
                index++;
            }
        }

        return result;
    }

}