import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> arrangement = new ArrayList<>();
        
        for(int i = l; i<=r; i++) {
            String str = String.valueOf(i);
            boolean value = true;
            
            for(char ch : str.toCharArray()) {
                if(ch != '0' && ch != '5') {
                    value = false;
                    break;
                }
            }
            
            if (value) {
                arrangement.add(i);
            }
        }
        
        int[] answer = new int[arrangement.size()];
        for(int i = 0; i<arrangement.size(); i++) {
            answer[i] = arrangement.get(i);
        }        
        
        if(arrangement.isEmpty()) {
            return new int[]{-1};
        }
        return answer;
    }       
}
