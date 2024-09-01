package backjun.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//지뢰찾기
public class Q1996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String arr[] = new String[count];

//        String mapp = "1....";

        for(int i=0; i<count; i++){
            String mapp = br.readLine();
            mapp = mapp.replaceAll("[0-9]","*");

            int num = mapp.length()-1;

            for(int j=0; j<num; j++){
                if((int)mapp.charAt(j) >= 10) {
                    int change = mapp.charAt(j);
                    mapp.replace((char) change, 'M');
                }
            arr[i] = mapp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
