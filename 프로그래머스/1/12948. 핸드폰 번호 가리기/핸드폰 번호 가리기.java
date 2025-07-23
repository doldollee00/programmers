class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(i<arr.length - 4){
                arr[i] = '*';
            }else{
                arr[i] = phone_number.charAt(i);     
            }
        }
        //System.out.println("hello");
                
        return answer = new String(arr);
    }
}