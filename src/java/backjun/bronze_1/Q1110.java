package java.backjun.bronze_1;


import java.util.*;

public class Q1110{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int count = 0;

        while(true){
            // 첫번째 숫자
            int firstNum = temp / 10;
            // 두번째 숫자
            int secondNum = temp % 10;

            // 더한 값
            int sum = firstNum + secondNum;

            // 두번째 숫자에 * 10을 한 값 + 두 개 더한 값의 10을 나눈 나머지
            temp =  (secondNum*10) + (sum%10);
            count++;

            // 입력값과 같다먼 반복문 중지
            if(num == temp){
                break;
            }
        }
        System.out.println(count);
    }
}