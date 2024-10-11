package java.backjun.bronze_1;

import java.util.Scanner;

// 부재중 전화
public class Q1333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 노래 횟수
        int L = sc.nextInt(); // 노래 길이
        int D = sc.nextInt(); // 공백

        int sum = L + 5; // 노래길이 + 조용한구간
        int total = sum;

        for(int i = 1; i <= N; i++) {
            // 노래 + 조용한구간 사이 범위에 전화가 오면
            if(total-5 < D && D < total){
                break;
            }else if(total < D){ // 노래+조용한구간 범위가 공백보다 작다면
                total = total + sum;
            }else{
                // 둘 다 해당 아닐 시 공백 반복
                D = D*i;
            }
        }
        System.out.println(D);
    }
}