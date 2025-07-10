public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                    found = true;
                }
            }
            answer[j] = found ? min : -1;
            j++;
        }
        return answer;
    }
}