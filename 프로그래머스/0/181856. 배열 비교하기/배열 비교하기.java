class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int a = arr1.length;
        int b = arr2.length;
        int result1 = 0;
        int result2 = 0;
        
        if(a > b) {return answer = 1;}
        else if(b > a) {return answer = -1;}
        else{
            for(int i=0; i<a; i++) {
                result1 += arr1[i];
                result2 += arr2[i];
            }
            if(result1 > result2) {answer = 1;}
            else if(result2 > result1) {answer = -1;}
            else{answer = 0;}
        }
        return answer;
    }
}