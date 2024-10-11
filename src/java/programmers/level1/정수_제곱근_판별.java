package java.programmers.level1;

import java.util.*;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("임의의 양의 정수 : ");
        int num = input.nextInt();

        System.out.print("제곱 확인 정수 : ");
        int compareNum = input.nextInt();

        // 출력 넣을 변수 선언
        int result = 0;


        for(int i=1; i<num; i++){
            compareNum = num/i;

            if(compareNum == i){
                result = (compareNum+1)*(compareNum+1);
                break;
            }else{
                result = -1;
            }
        }
        System.out.println(result);
    }
}
