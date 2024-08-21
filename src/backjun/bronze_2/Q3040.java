package backjun.bronze_2;

import java.util.ArrayList;
import java.util.Scanner;

// 백설 공주와 일곱 난쟁이
public class Q3040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 난쟁이 모자 번호 받을 ArrayKist 생성
        ArrayList<Integer> arr = new ArrayList<>();

        // 모자 번호 합
        int sum = 0;

        for(int i=0; i<9; i++){
            arr.add(input.nextInt());
            sum += arr.get(i);
            // 모자 번호를 받기
        }

        // 모자 번호 합 - 100 을 뺀 나머지 수
        int rest = sum-100;

        label:
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                // 모자 번호 순서대로 더해 합 구하기
                int result = arr.get(i) + arr.get(j);
                if(rest == result){ //모자 번호 합이 나머지수와 같다면
                    arr.remove(j); // 모자번호 뒤에서부터 지우기
                    arr.remove(i);
                    break label;
                }
            }
        }
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
            // 남은 모자 차례대로 출력
        }
    }
}
