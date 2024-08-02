package programmers.level1;

import java.util.Scanner;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = input.nextInt();

        String str = "";

        if(num % 2 == 0){
            str = "Even";
        }else{
            str = "Odd";
        }

        System.out.println(str);
    }
}
