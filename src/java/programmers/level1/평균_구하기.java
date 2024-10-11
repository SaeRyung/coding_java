package java.programmers.level1;

public class 평균_구하기 {
    public double solution(int[] arr) {
        double answer = 0;

        int len = arr.length;

        for(int i=0; i<len; i++){
            answer += arr[i];
        }

        answer = (double) (answer/len);

        return answer;
    }
}
