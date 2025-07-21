import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = Integer.toString(n);
        char[] charArr = num.toCharArray();
        int[] arr = new int[charArr.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = charArr[i] - '0';
        }
        
        for(int j=0; j<arr.length; j++){
            answer += arr[j];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}