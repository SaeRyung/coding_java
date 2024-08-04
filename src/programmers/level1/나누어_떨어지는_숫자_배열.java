package programmers.level1;

import java.util.*;

class 나누어_떨어지는_숫자_배열 {
    // 정해지지 않은 배열 위해 ArrayList 사용
    public ArrayList<Integer> solution(int[] arr, int divisor) {

        int len = arr.length;
        ArrayList<Integer> answer = new ArrayList<>();

        // 반복문으로 나누어 떨어지는 원소가 있으면 answer 리스트에 넣기
        for(int i=0; i<len; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }

        // answer 리스트에 값 하나도 없을때, 길이 0일시에 -1 return
        int answerLen = answer.size();
        if(answerLen == 0){
            answer.add(-1);
        }

        // 오름차순 정렬
        Collections.sort(answer);

        return answer;
    }
}
