import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= number; i++) {
            int count = divisorCount(i);
            if (count > limit) count = power;
            list.add(count);
        }
        
        for (int sum : list) answer += sum;
        return answer;
    }
    
    private int divisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; 
                if (i != n / i) count++; 
            }
        }
        return count;
    }
}