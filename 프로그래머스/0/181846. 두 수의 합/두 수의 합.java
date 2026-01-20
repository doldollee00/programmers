import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger value1 = new BigInteger(a);
        BigInteger value2 = new BigInteger(b);
        return answer = value1.add(value2).toString();
    }
}