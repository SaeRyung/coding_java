package java.backjun.silver_4;
// 게임을 만든 동준이
import java.util.*;

public class Q2847 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int count = num.nextInt(); // 레벨 개수 받아오기

        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = num.nextInt();
            // 레벨 개수만큼 얻은 점수 배열로 받아오기
        }

        // 감소시킬 점수 총 합
        int minus = 0;

        for (int i = count - 1; i > 0; i--) { //배열 뒤에서부터 반복문 시작
            if (arr[i] - arr[i - 1] <= 0) {
                // 점수 차이가 0이거나 음수라면
                int dif = (arr[i-1] - arr[i]) + 1; // 점수 차이 + 1을 한 후
                minus += dif; //차감할 점수 합에 더한 후
                arr[i-1] -= dif; //점수 차감하기
            }
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(minus);
    }
}