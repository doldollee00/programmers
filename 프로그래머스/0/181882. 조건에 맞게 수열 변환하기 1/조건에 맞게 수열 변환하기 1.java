class Solution {
    public int[] solution(int[] arr) {
        int num = arr.length;
        int[] answer = new int[num];
        int j = 0;
        
        for(int i=0; i<num; i++) {    
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[j++] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[j++] = arr[i] * 2;
            } else {
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}