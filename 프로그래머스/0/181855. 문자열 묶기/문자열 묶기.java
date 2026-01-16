import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        
        for(String str : strArr) {
            result.add(str.length());
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num : result) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0;
        
        for(int count : countMap.values()) {
            if(count > maxCount) {
                maxCount = count;
            }
        }
        return answer = maxCount;
    }
}