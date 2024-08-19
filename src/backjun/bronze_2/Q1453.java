package backjun.bronze_2;

import java.util.*;

// 피시방 알바
public class Q1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();
        // 손님 인원수에 맞는 배열 생성
        int[] list = new int[customer];

        // 앉고 싶은 자리 배열에 넣기
        for(int i=0; i<customer; i++) {
            list[i] = sc.nextInt();
        }

        // 이미 앉은 자리 배열 생성
        List seats = new ArrayList();
        for(int i = 0; i<customer; i++) {
            if(!seats.contains(list[i])) {
                // 자리 비어있으면 앉기
                seats.add(list[i]);
            }
        }
        // 앉은 사람 인원수
        int count = seats.size();

        // 총 인원 수 - 앉은 사람 인원
        int result = customer - count;

        // 결과값
        System.out.println(result);
    }
}
