package programmers.level1;

import java.util.*;
import java.io.*;

public class Sum_NumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        String num = input.nextLine();

        int len = num.length();
        int sum = 0;
        int changeNum = 0;

        for(int i=0; i<len; i++) {
            changeNum = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum += changeNum;
        }
        System.out.println(sum);

    }
}
