package java.programmers.level1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        // 글자 길이
        int len = s.length();
        // 몫으로 글자 가운데 번호 가져오기
        int point = len/2;
        String result = "";

        for(int i=0; i<len; i++){
            //글자 길이가 짝수라면
            if(len%2 == 0){
                // 가운데 두글자 가져오기
                result = s.substring(point-1,point+1);
            }else{
                // 홀수라면 가운데 글자만 가져오기
                result = String.valueOf(s.charAt(point));
            }
        }
        return result;
    }
}
