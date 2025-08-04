class Solution {
    public String solution(int[] food) {
        StringBuilder arr = new StringBuilder();
          
        for(int i=1; i<food.length; i++) {              
            for(int q=0; q<food[i]/2; q++) {
                arr.append(i);
            }
        }
        String answer = arr.toString()+"0"+arr.reverse().toString();
        return answer;
    }
}
