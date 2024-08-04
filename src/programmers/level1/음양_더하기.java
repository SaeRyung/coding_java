package programmers.level1;

class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int len = absolutes.length;
        String minus = "";
        String[] Arr = new String[len];

        int[] Result = new int[len];

        int sum = 0;

        for(int i =0; i<len; i++){
            if(signs[i] == false){
                // 음수로 배열에 넣기
                Arr[i] = "-" + absolutes[i];

                Result[i] = Integer.parseInt(Arr[i]);

                sum += Result[i];

            }else{
                sum += absolutes[i];
            }
        }
        return sum;
    }
}
