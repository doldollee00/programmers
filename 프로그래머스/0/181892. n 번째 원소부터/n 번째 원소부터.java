import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
                
        int arr = num_list.length;
        int result = arr - 1;
                
        return Arrays.copyOfRange(num_list, n-1, result+1);
    }
}