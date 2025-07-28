class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String arr = Integer.toString(n, 3);
        System.out.println(arr);
        
        String reverse = new StringBuilder(arr).reverse().toString();
        System.out.println(reverse);
        
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}