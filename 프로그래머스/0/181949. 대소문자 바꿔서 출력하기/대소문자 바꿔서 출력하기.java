import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //Char[] result = a.toCharArray(); 
        String result = ""; //String 변수를 선언할때 ""를 넣지 않으면 해당 이름은 변수로 지정되어 결과값이 하나로 통으로 들어간다.
                            //변수 지정지 ""를 넣음으로써 문자열로 인식되고, 아래 charAt() 에서 하나씩 확인된 것을 문자열 하나씩 입력된다
        
        
        for(int i=0; i<a.length(); i++) //a.length 는 a값의 길이 ex) 안녕하세요 = 5
        {
           char b = a.charAt(i);
            
            if(Character.isUpperCase(b))
            {
                result += Character.toLowerCase(b);
            }
            else
            {
                result += Character.toUpperCase(b);
            }
        }     
        System.out.println(result);
    }
}