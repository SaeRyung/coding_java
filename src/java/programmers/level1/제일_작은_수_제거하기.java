package java.programmers.level1;

import java.util.*;

public class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        // 배열 길이
        int len = arr.length;
        // 오름차순으로 정렬
        Arrays.sort(arr);


        if(arr[0] == 10){
            int[] result = new int[1];
            result[0] = -1;
            return result;

        }else{
            int[] result = new int[len-1];
            for(int i=len-1; i<len; i--){
                int count = 0;
                if(i != 0){
                    result[count] = arr[i];
                    ++count;
                }else{
                    break;
                }
            }
            return result;
        }
    }
}
