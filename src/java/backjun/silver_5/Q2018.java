package java.backjun.silver_5;

import java.io.*;

// 투 포인터 - 수들의 합 5
public class Q2018 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 문제

        int count = 1; // 자기 자신 카운트 1 먼저 하기
        int sum = 1;
        int str_idx = 1;
        int end_idx = 1;

        while(end_idx != num){
            if(sum == num){ // 연속하는 수 찾았을 때
                count++; // 카운트 증가
                end_idx++; // 구간 확장 후
                sum += end_idx; //sum 에 더하기

            }else if(sum < num){
                end_idx++; // 구간 확장 후
                sum += end_idx; // sum 에 더하기

            }else{
                sum -= str_idx; // 빼고 난 후
                str_idx++; //인덱스 이동

            }
        }

        System.out.println(count);
    }
}
