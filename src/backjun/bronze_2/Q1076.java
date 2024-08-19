package backjun.bronze_2;

import java.util.*;
// 저항
public class Q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine(); // 첫번째 색
        String secondColor = sc.nextLine(); // 두번째 색
        String thirdColor = sc.nextLine(); // 세번째 색

        HashMap<String, List> color = new HashMap<>(); // key: 색, value: 숫자값 받아오기

        color.put("black", Arrays.asList(0, 1));
        color.put("brown", Arrays.asList(1, 10));
        color.put("red", Arrays.asList(2, 20));
        color.put("orange", Arrays.asList(3, 1000));
        color.put("yellow", Arrays.asList(4, 10000));
        color.put("green", Arrays.asList(5, 100000));
        color.put("blue", Arrays.asList(6, 1000000));
        color.put("violet", Arrays.asList(7, 10000000));
        color.put("grey", Arrays.asList(8, 100000000));
        color.put("white", Arrays.asList(9, 1000000000));

        List result1 = (color.get(firstColor)); // 첫번째 색 리스트
        List result2 = (color.get(secondColor)); // 두번째 색 리스트
        List result3 = (color.get(thirdColor)); // 세번째 색 리스트

        String var =(Integer.toString((Integer)result1.get(0)) + Integer.toString((Integer)result2.get(0)));
        // 첫번째 색 1번 value값과 두번째 색 1번 value 값을 String으로 가져오기

        int resis = Integer.parseInt(var) * ((Integer)result3.get(1));
        // String으로 가져온 첫번째, 두번째 색을 붙인 후 세번째 색 곱

        System.out.println(resis);






    }
}
