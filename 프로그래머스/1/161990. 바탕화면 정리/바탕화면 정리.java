class Solution {
    public int[] solution(String[] wallpaper) {
        //int[] answer = {};
        int lux = 50;
        int luy = 50;
        int rdx = 0;
        int rdy = 0;
        int value = 0;
        
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                if(lux >= i) {
                    lux = i;
                }
                if(rdx <= i) {
                    rdx = i;
                }
                
                for(int j=0; j < wallpaper[i].length(); j++ ){
                    if(wallpaper[i].charAt(j)=='#') {
                        if(luy > j) {
                            luy =j;
                        }
                        if(rdy < j) {
                          rdy = j;  
                        }
                    } 
                }
            }
        }
        System.out.println(lux + "" + luy + "" + rdx + "" + rdy);
        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}