package java.backjun.bronze_1;

import java.util.*;
// 초콜릿 자르기
public class Q2163 {
    public static void main(String[] args) {
        // 두 개의 정수 입력
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        // 초콜릿을 크기(1*1)로 최소한 횟수로 자르기
        int result = (N * M)-1;

        System.out.println(result);
    }
}
