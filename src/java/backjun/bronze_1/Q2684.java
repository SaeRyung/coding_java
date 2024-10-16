package java.backjun.bronze_1;
// Q2684 동전 게임
import java.util.*;
public class Q2684 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();

        String[] arr = {"TTT", "TTH", "THT", "THH", "HTT", "HTH","HHT","HHH"};
        int arrLen = arr.length;

        Map<String, Integer> dic = new LinkedHashMap<>();

//        String HHH = "HHH"; // 앞앞앞
//        String HHT = "HHT"; // 앞앞뒤
//        String HTH = "HTH"; // 앞뒤앞
//        String HTT = "HTT"; // 앞뒤뒤
//        String THH = "THH"; // 뒤앞앞
//        String THT = "THT"; // 뒤앞뒤
//        String TTH = "TTH"; // 뒤뒤앞
//        String TTT = "TTT"; // 뒤뒤뒤

        for(int i=0; i<arrLen; i++){
//            String key = arr[i];
            dic.put(arr[i],0);
            int count = 0;
            for(int j=0; j<len-2; j++){
                // 글자 차례대로 3개씩 자르기
                String coin = str.substring(j,j+3);
                // 키값과 글자값이 같을 시
                if(coin.equals(arr[i])){
                    count++;
                }
                dic.put(arr[i],count);
            }
        }
        // 키를 기준으로 정렬
//        Map<String, Integer> sortedDic = new TreeMap<>(dic);
//        Collections.reverse((List<?>) dic);
//        List<String> result = new ArrayList<>(dic.keySet()); //정렬 위해 ArrayList 준비
//        Collections.sort(result, Collections.reverseOrder());


        Collection<Integer> values = dic.values();
        Collection<String> key = dic.keySet();

        System.out.println(key);
        System.out.println(values);
    }
}
