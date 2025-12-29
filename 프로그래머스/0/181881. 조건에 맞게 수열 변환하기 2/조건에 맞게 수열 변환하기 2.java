import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int num = arr.length;
        int[] result1 = new int[num];
        int[] result2 = arr.clone();
        int number = 0;
        
        while(true) {
            int j = 0;
            for(int i=0; i<num; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    result1[j++] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    result1[j++] = arr[i] * 2 + 1;
                } else {
                    result1[j++] = arr[i];
                }
            }
            
            if(Arrays.equals(result1, result2)) {
                answer = number;
                break;
            }
            result2 = result1.clone();
            arr = result1.clone();
            number++;
        }   
        return answer;
    }
}