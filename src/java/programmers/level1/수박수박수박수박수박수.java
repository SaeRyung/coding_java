package java.programmers.level1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {

        String answer = "";

        for(int i=0; i<n; i++){
            if(i == 0 || i%2 == 0 ){
                answer += "수";
            }else if(i%2 != 0){
                answer += "박";
            }
        }
        return answer;
    }
}
