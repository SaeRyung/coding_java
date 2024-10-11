package java.programmers.level1;

class 콜라츠_추측 {
    public long solution(long num) {
        long count = 0;
        boolean run = true;

        if(num == 1){
            count = 0;
            run = false;
        }else{
            while(run)
            {
                if(num % 2 == 0){
                    // 짝수인 경우
                    count+=1;
                    num = num/2;

                }else if(num == 1){
                    // 반복문 종료. 결과값 도출
                    run = false;

                }else if(count > 500){
                    // 반복문 종료. 카운트 초과
                    count = -1;
                    run = false;

                }else{
                    // 홀수인 경우
                    count+=1;
                    num = (num * 3) + 1;
                }
            }
        }
        return count;
    }
}