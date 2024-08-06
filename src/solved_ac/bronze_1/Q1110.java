package solved_ac.bronze_1;

import java.util.*;

public class Q1110 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            // 배열에 숫자를  받아온 후 한 문자씩 끊기
            String[] inputNum = in.nextLine().split("");
            int inputLen = inputNum.length();

            int count = 0;
            int firstNum = 0;
            int secondNum = 0;
            int sum = 0;

            int compare = 0;

            while(true){
                if(inputLen > 0){
                    firstNum = Integer.parseInt(inputNum[0]);
                    secondNum = Integer.parseInt(inputNum[1]);

                    sum = firstNum + secondNum;

                    compare = secondNum + sum;


                }
            }


        }
    }
