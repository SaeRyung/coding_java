package java.backjun.bronze_2;
// 찍기

import java.io.*;
import java.util.*;

public class Q2966{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine()); //문제 개수
        String answer = bf.readLine(); //문제 문자열

        // 각각 찍어야 하는 찍기 문자열 초기화
        String AdrianStr = "ABC";
        String BrunoStr = "BABC";
        String GoranStr = "CCAABB";

        // 찍어야 하는 답을 문제 개수에 맞춰서 추가하기 위한 찍기 배열 선언
        String[] Adrian = new String[num];
        String[] Bruno = new String[num];
        String[] Goran = new String[num];

        for(int i=0; i<num; i++){
            if(Adrian[i] == null){ // 찍기 배열이 null 이라면
                for(int j=0; j<AdrianStr.length(); j++){ // 찍기 문자열 반복문
                    if(j+i >= num){ // 찍기 문자열이 문제 개수에 맞게 채워졌다면 반복문 종료
                        break;
                    }
                    Adrian[j+i] = String.valueOf(AdrianStr.charAt(j)); //찍기 배열에 문자열 넣기
            }
          }

            if(Bruno[i] == null){
                for(int j=0; j<BrunoStr.length(); j++){
                    if(j+i >= num){
                        break;
                    }
                    Bruno[j+i] = String.valueOf(BrunoStr.charAt(j));
                }
            }

            if(Goran[i] == null){
                for(int j=0; j<GoranStr.length(); j++){
                    if(j+i >= num){
                        break;
                    }
                    Goran[j+i] = String.valueOf(GoranStr.charAt(j));
                }
            }
        }

        // 같은 문자 카운트할 변수 초기화
        int AdrianNum = 0;
        int BrunoNum = 0;
        int GoranNum = 0;


        // 문자 비교하여 같은 값 존재시 카운트 추가
        for(int i=0; i<num; i++){
            String ch = answer.charAt(i)+""; //"" 를 더해서 char > string 형변환
            if( ch.equals(Adrian[i])){
                AdrianNum++;
            }
            if(ch.equals(Bruno[i])){
                BrunoNum++;
            }
            if(ch.equals(Goran[i])){
                GoranNum++;
            }
        }


        Map<String,Integer> map = new LinkedHashMap<>(); //key, value값으로 순서별 값 넣기
        map.put("Adrian",AdrianNum);
        map.put("Bruno",BrunoNum);
        map.put("Goran",GoranNum);

        Integer maxValue = Collections.max(map.values()); //카운트 최대값 구하기

        System.out.println(maxValue);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey(); //key값(이름)
            Integer v = entry.getValue(); //value값(카운트)
            if (v == maxValue) { // 카운트값이 최대값과 같은 값이라면
                System.out.println(k); //출력
            }
        }
    }
}
