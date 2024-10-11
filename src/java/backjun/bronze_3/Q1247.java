package java.backjun.bronze_3;

import java.util.Scanner;

// 부호
public class Q1247 {
    public static void main(String[] args){
        String result = "";

        for(int i=0; i<3; i++){
            Scanner input = new Scanner(System.in);
            long count = input.nextLong();
            long sum = 0;
            for(int j=0; j<count; j++){
                long num = input.nextLong();
                sum += num;
            }

            if(sum == 0){
                result += "0";
            }else if(sum > 0){
                result += "+";
            }else{
                result += "-";
            }
        }
        int len = result.length();
        for(int k=0; k<len; k++){
            System.out.println(result.charAt(k));
        }
    }
}
