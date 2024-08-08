package backjun.bronze_1;

import java.util.*;


public class Q1157 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("알파벳 입력 : ");
        // 문자열 대문자로 변환
//        String str = input.nextLine().toUpperCase();

        String str = "aabac";

        int len = str.length();

        // 딕셔너리 변수 선언
        Map<String, Integer> dic = new HashMap<>();

        // 문자열 길이만큼 반복문
        for(int i=0; i<len; i++){
            String key = String.valueOf(str.charAt(i));
            if(dic.containsKey(key)){
                int count = dic.get(key);
                count +=1;
                dic.put(key,count);

            }else{
                dic.put(key, 1);
            }
        }
        // 최대 Value값
        Integer maxValue = Collections.max(dic.values());



    }
}
