package java.programmers.level1;

import java.util.*;

public class 문자열_내_p와_y의개수 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");

        String str = input.nextLine();
        str = str.toLowerCase();

        int len = str.length();
        int countP = 0;
        int countY = 0;

        for(int i=0; i<len; i++){
            if(str.charAt(i) == 'y'){
                countY++;
            }else if(str.charAt(i) == 'p'){
                countP++;
            }else{
                continue;
            }
        }

        if(countP == countY){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
