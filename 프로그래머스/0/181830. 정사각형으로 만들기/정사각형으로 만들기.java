class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        
        int n = Math.max(a, b);
        int[][] answer = new int[n][n];
        
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}