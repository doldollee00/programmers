class Solution {
    public String solution(int n) {
        
        String hol = "수";
        String jjak = "박";
        StringBuilder arr = new StringBuilder();
        
        for(int i=0; i<n; i++){
            if((i)%2 == 0){
                arr.append(hol);
            }else{
                arr.append(jjak);
            }
        }
        return arr.toString();
    }
}