class Solution {

    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] countX = new int[10];
        int[] countY = new int[10];

        char[] arr = X.toCharArray();
        char[] brr = Y.toCharArray();
        

        for (char a : arr) {
            countX[a - '0']++;
        }
        for (char b : brr) {
            countY[b - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            int result = Math.min(countX[i], countY[i]);
            
            for (int j = 0; j < result; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}