import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int[] result = { a, b, c, d };
        Arrays.sort(result);

        if (result[0] == result[3]) {
            answer = 1111 * result[3];
        } else if (result[0] == result[2] || result[1] == result[3]) {
            answer = (int) Math.pow(result[1] * 10 + (result[0] + result[3] - result[1]), 2);
        } else if (result[0] == result[1] && result[2] == result[3]) {
            answer = (result[0] + result[3]) * (result[3] - result[0]);
        } else if (result[0] == result[1]) {
            answer = result[2] * result[3];
        } else if (result[1] == result[2]) {
            answer = result[0] * result[3];
        } else if (result[2] == result[3]) {
            answer = result[0] * result[1];
        } else {
            answer = result[0];
        }

        return answer;
    }
}