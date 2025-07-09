class Solution {
    public String solution(int[] numLog) {
        StringBuilder st = new StringBuilder();
        
        
        for(int i=1; i<numLog.length; i++) {
            
            int diff = numLog[i] - numLog[i-1];
             
            switch(diff) {
                case 1: 
                    st.append('w');
                    break;
                case -1: 
                    st.append('s');
                    break;
                case 10:
                    st.append('d');
                    break;
                case -10: 
                    st.append('a');
                    break;
                default:
                    break;
            }
        }
        return st.toString();
    }
}
