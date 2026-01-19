import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
               result.add(i);
            }
        }
        result.sort((a, b) -> rank[a] - rank[b]);
        
        int a = result.get(0);
        int b = result.get(1);
        int c = result.get(2);
        
        return answer = a * 10000 + b * 100 + c;
    }
}

