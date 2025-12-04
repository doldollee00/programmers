class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
         
        for(int result = 0; result < arr.length; result++) {
            if(result >= idx) {
                if(arr[result] == 1) {
                    return answer = result;
                }
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}