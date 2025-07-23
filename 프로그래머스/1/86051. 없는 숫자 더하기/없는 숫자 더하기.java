class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
        
        for(int i=0; i<10; i++){
            result1 += i;
        }
        System.out.println(result1);
        for(int i=0; i<numbers.length; i++){
            result2 += numbers[i];
        }
        System.out.println(result2);
        
        return answer = result1 - result2;
    }
}