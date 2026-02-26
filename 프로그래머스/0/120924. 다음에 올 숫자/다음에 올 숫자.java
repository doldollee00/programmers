class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int n = common.length;
        
        if(common[1] - common[0] == common[2] - common[1]) {
            int result = common[1] - common[0];
            return answer = common[n - 1] + result;
        } else {
            int result = common[1] / common[0];
            answer = common[n - 1] * result;
        }
        return answer;
    }
}