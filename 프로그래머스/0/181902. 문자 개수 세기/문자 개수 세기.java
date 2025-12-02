class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char arr[] = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++) {
             if(arr[i] > 64 && arr[i] < 91) {
                 int result = arr[i] - 65;
                 answer[result]++;
             } else if(arr[i] > 96 && arr[i] < 123) {
                 int result = arr[i] - 71;
                 answer[result]++;
             }
        }
        return answer;
    }
}