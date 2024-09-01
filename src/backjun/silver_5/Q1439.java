package backjun.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 뒤집기
public class Q1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String fir = str.substring(0, 1); // 처음 문자열 값을 기준

        int count0 = 0; // 0 -> 1로 바뀌는 구간 수
        int count1 = 0; // 1 -> 0으로 바뀌는 구간 수

        // 기준값에 따른 초기 카운트
        if (fir.equals("0")) {
            count0++;
        } else {
            count1++;
        }

        for (int i = 1; i < str.length(); i++) { // 문자열 길이만큼 반복문
            if (!str.substring(i, i + 1).equals(fir)) {
                // 차례대로 문자열 값이 기준값 fir과 같지 않다면
                if (str.substring(i, i + 1).equals("0")) {
                    // 0 일때
                    count0++;
                } else {
                    // 1 일때
                    count1++;
                }
                fir = str.substring(i, i + 1);
                // 기준 문자열 변경
            }
        }
        System.out.println(Math.min(count0, count1));
        // 두 값 중 더 작은 값을 선택해 최소한의 뒤집기 횟수 출력
    }
}