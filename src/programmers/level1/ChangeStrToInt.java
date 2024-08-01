package programmers.level1;

import java.io.*;
import java.util.*;

public class ChangeStrToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String s = input.nextLine();

        int number = Integer.valueOf(s);

        System.out.println(number);
    }
}
