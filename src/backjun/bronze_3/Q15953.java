package backjun.bronze_3;

import java.util.*;
// 상금 헌터
public class Q15953 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt(); // 첫번째 입력값 횟수

        for(int i=0; i<count; i++){
            int money = 0;
            int first = input.nextInt(); //첫번째 페스티벌 등수
            int second = input.nextInt(); //두번째 페스티벌 등수

            // 첫번째 페스티벌 등수에 따른 상금
            if(first == 1){
                money += 5000000;
            }else if(1<first && first<=3){
                money += 3000000;
            }else if(3<first && first<=6){
                money += 2000000;
            }else if(6<first && first<=10){
                money += 500000;
            }else if(10<first && first<=15){
                money += 300000;
            }else if(15<first && first<=21){
                money += 100000;
            }

            // 두번째 페스티벌 등수에 따른 상금
            if(second == 1){
                money += 5120000;
            }else if(1<second && second<=3){
                money += 2560000;
            }else if(3<second && second<=7){
                money += 1280000;
            }else if(7<second && second<=15){
                money += 640000;
            }else if(15<second && second<=31){
                money += 320000;
            }
            System.out.println(money);
        }

    }
}
