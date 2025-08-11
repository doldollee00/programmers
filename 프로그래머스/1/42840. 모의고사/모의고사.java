import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] result1 = {1, 2, 3, 4, 5};
        int[] result2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] result3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == result1[i % result1.length]){
                sum1++;
            }else{
            }    
        }

        for(int i=0; i<answers.length; i++){
            if(answers[i] == result2[i % result2.length]){
                sum2++;
            }else{
            }    
        }
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == result3[i % result3.length]){
                sum3++;
            }else{
            }    
        }
        //System.out.println(sum1 + " " + sum2 + " " + sum3);
        
        int max = Math.max(sum1, Math.max(sum2, sum3));

        List<Integer> list = new ArrayList<>();
        if (sum1 == max) list.add(1);
        if (sum2 == max) list.add(2);
        if (sum3 == max) list.add(3);

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }
}