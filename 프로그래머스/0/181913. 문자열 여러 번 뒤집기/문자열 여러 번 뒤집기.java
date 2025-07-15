class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            while(s < e) {
                char box = arr[s];
                arr[s] = arr[e];
                arr[e] = box;
                s++;
                e--;
                }
            }
        return answer = new String(arr);
    }
}