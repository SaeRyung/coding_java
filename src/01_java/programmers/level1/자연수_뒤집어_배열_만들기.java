package java.programmers.level1;

import java.util.*;

public class 자연수_뒤집어_배열_만들기 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("자연수 n 입력 : ");

        String n = input.nextLine();
        int len = n.length();
        int[] answer = new int[len];

        for(int i=0; i<len; i++){
            answer[i] += Integer.parseInt(String.valueOf(n.charAt(len-i-1)));
        }

        System.out.println(Arrays.toString(answer));
    }
}
