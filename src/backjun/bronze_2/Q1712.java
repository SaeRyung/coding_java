package backjun.bronze_2;

import java.util.Scanner;

// 손익분기점
public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 가변 비용
        int C = sc.nextInt(); // 상품 1개 가격

        if(C <= B){
            // C - B 가 0이거나 음수인 경우
            System.out.println(-1);
        }else{
            // 이익이 나는 지점은 +1 => 판매량 개수
            System.out.println((A/(C-B))+1);
        }
    }
}
