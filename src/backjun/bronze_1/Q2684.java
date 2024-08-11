package backjun.bronze_1;
// Q2684 동전 게임
import java.util.*;
public class Q2684 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();

        String[] arr = {"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"};
        int arrLen = arr.length;

        Map<String, Integer> dic = new HashMap<>();

//        String HHH = "HHH"; // 앞앞앞
//        String HHT = "HHT"; // 앞앞뒤
//        String HTH = "HTH"; // 앞뒤앞
//        String HTT = "HTT"; // 앞뒤뒤
//        String THH = "THH"; // 뒤앞앞
//        String THT = "THT"; // 뒤앞뒤
//        String TTH = "TTH"; // 뒤뒤앞
//        String TTT = "TTT"; // 뒤뒤뒤

        for(int i=0; i<arrLen; i++){
            String key = arr[i];
            int count = 0;
            for(int j=0; j<len; j++){
                String coin = str.substring(i,i+3);
                if(coin.equals(arr[i])){
                    count++;
                }
                dic.put(key,count);
            }
        }
        Collection<Integer> values = dic.values();
        System.out.println(values);
    }
}
