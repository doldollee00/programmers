class Solution {
    public int[] solution(int start_num, int end_num) {
        int arr = start_num - end_num + 1;
        int[] answer = new int[arr];
        int j=0;
        
        for(int i = start_num; i>=end_num; i--) {
            answer[j] = i;
            j++;
        }
        
        return answer;
    }
}