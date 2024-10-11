package java.programmers.level1;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        // 폰 번호 길이
        int len = phone_number.length();
        // 가릴 번호 길이
        int blind = len-4;

        //공개할 마지막 4번째 자리
        String public_num = phone_number.substring(blind, len);

        String result = "";

        for(int i=0; i<blind; i++){
            // 가릴 번호 길이만큼 '*' 추가
            result += "*";
        }

        // 가릴 번호 + 공개 4자리
        String answer = result + public_num;

        return answer;
    }

}
