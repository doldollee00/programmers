class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int leng = num.length();
        int[] answer = new int[leng];
        
        for(int i=0; i<leng; i++){
            answer[i] = num.charAt(leng-1-i) - '0';
        }        
        return answer;
    }
}