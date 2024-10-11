package java.backjun.silver_3;

import java.util.*;
import java.io.*;

// Q11659 구간 합 구하기 4
public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int countN = Integer.parseInt(st.nextToken()); //첫번째 N의 개수
        int countSUM = Integer.parseInt(st.nextToken()); //합 횟수

        long[] arr = new long[countN + 1]; // 합 배열

        st = new StringTokenizer(br.readLine()); //배열 받아오기

        // 1. 먼저 합 배열 구하기
        for(int i=1; i<=countN; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        // 2. 합 횟수만큼 반복하기
        for(int i=0; i<countSUM; i++){
            // 계산 범위 받기
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 구간 합 출력하기
            System.out.println(arr[B] - arr[A-1]);
        }

    }
}
