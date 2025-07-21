import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] arr = Long.toString(n).toCharArray();
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        
        
        return answer = Long.parseLong(sb.toString());
    }
}