package programmers.level1;

class 하샤드_수 {
    public boolean solution(int x) {
        // x -> string로 변경
        String num = Integer.toString(x);
        // for문 횟수 위한 문자열 길이
        int len = num.length();
        // 배열
        int[] ArrNum = new int[len];

        int sum = 0;

        for(int i=0; i<len; i++){
            // String->x 값을 정수로 변경하여 배열에 넣기
            ArrNum[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            // 정수 자릿수 합계
            sum += ArrNum[i];
        }

        // 정수를 자릿수와 나눠서 나머지 0이면 true 아니면 false
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}