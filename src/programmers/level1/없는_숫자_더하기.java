package programmers.level1;

class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        // 범위 0-9 더한 값 45
        int sum = 45;
        int len = numbers.length;
        for(int i=0; i<len; i++){
            // 45에서 numbers에서 일부가 들어간 숫자 빼기
            sum -= numbers[i];
        }
        return sum;
    }
}
