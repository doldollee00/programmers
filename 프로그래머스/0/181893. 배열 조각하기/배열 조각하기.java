import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        int left = 0;
        int right = arr.length - 1;

        for(int i = 0; i < query.length; i++) {
            int q = query[i];

            if (i % 2 == 0) {
                right = left + q;
            } else {
                left = left + q;
            }
        }
        return Arrays.copyOfRange(arr, left, right + 1);
    }
}
