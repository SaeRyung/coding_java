package programmers.level1;

import java.util.*;

public class Desc_Int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        // 문자열 배열에 숫자를 받음
        // split로 하나씩 끊기
        String[] inputNum = in.nextLine().split("");

        // 배열 길이
        int len = inputNum.length;
        // 문자열로 받은 타입 -> 숫자로 형변환
        long[] result = new long[len];
        for(int i=0; i<len; i++){
            result[i] = Integer.parseInt(inputNum[i]);
        }

//        Arrays.sort(result);


        for(int i=0; i<len; i++){
            int temp = 0;
            for(int j=0; j<len; j++){
                if(result[i] > result[j]){
                    temp = (int) result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(result));


    }
}
