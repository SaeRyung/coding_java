package backjun.bronze_3;

import java.util.Scanner;

// 사탕 선생 고창영
public class Q2547 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int test = input.nextInt(); // 테스트 횟수
            int count = 0; //테스트 횟수 초과 시 반복문 종료 카운트
            boolean check = true;
            String result = ""; // 결과값 받을 변수

            input.nextLine(); //개행

            while(check){
                long sum = 0;

                long student = input.nextLong(); // 학생 수 받기
                for(int i=0; i<student; i++){ // 학생 수만큼 반복문
                    long candy = input.nextLong(); // 걱걱 학생들이 가져온 사탕값 받기
                    sum += candy; // 전체 사탕 개수 더하기
                }

                if(sum % student == 0){
                    result += "YES"; //사탕개수 동일하게 학생들이 받으면 YES
                }else{
                    result += "NO"; // 사탕개수 동일하지 않으면 NO
                }
                count++;

                if(count == test){
                    check = false; // 테스트 회수 초과시 반복문 종료
                } else{ result += "\n"; } // 결과값에 개행 더하기
            }

            System.out.println(result);
        }
    }
