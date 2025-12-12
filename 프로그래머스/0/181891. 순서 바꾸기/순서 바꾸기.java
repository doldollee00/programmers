class Solution {
    public int[] solution(int[] num_list, int n) {
        int arr = num_list.length;
        int[] answer = new int[arr];
        int count = 0;
        
        for(int i=n; i<arr; i++) {
            answer[count++] = num_list[i];
        }
        for(int i=0; i<n; i++) {
            answer[count++] = num_list[i];
        }
        
        return answer;
    }
}