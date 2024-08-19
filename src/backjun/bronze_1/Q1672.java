package backjun.bronze_1;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

// DNA 해독
public class Q1672 {
    public static void main(String[] args) {
//        String[][] arr = {{"A", "C", "A", "G"},
//                          {"C", "G", "T", "A"},
//                          {"A", "T", "C", "G"},
//                           {"G", "A", "G", "T"}};
//
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextInt();
        String str = input.nextLine();
//
//        LinkedList<String> list = new LinkedList<>();
//
//
//        Map<String, Integer> mapList = new LinkedHashMap<>();
//        mapList.put("A", 0);
//        mapList.put("G", 1);
//        mapList.put("C", 2);
//        mapList.put("T", 3);

//        while(true){
            for(int i=count; i >= 0; i--){
                System.out.println(str.charAt(i));
            }
//        }


    }
}
