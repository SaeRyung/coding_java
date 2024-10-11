package java.programmers.level1;

import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 간격 x
        System.out.print("간격 입력 : ");
        int x = input.nextInt();

        // 갯수 n
        System.out.print("갯수 입력 : ");
        int n = input.nextInt();
        // 결과값 담을 배열
        int[] result = new int[n];

//        result[0] = x;

        for(int i = 0; i < n; i++){
            result[i] = x * (i+1);
        }

        System.out.println(Arrays.toString(result));
    }
}
