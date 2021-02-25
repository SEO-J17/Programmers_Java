  package Level1;

public class 신규아이디추천 {
	class Solution {
	    public String solution(String id) {
	        String answer = "";
	        id = id.toLowerCase();
	        char dot = 'A';
	        
	        for(int i=0; i<id.length(); i++){
	            char alph= id.charAt(i);
	            if((alph >= 'a' && alph <= 'z') || alph == '.' || (alph >= '0' && alph <='9') 
	               || alph == '-' || alph == '_'){
	                if(alph == '.' && dot != alph){
	                    dot = alph;
	                    answer += String.valueOf(alph);  
	                }else if(alph == '.' && dot == alph){
	                    continue;
	                }else{
	                    answer += String.valueOf(alph);
	                    dot = alph;
	                }              
	            }            
	        }
	       
	        
	        if(answer.startsWith(".")){
	            answer = answer.substring(1,answer.length());          
	        }else if(answer.endsWith(".")){
	            answer = answer.substring(0,answer.length()-1);         
	        }
	        	                
	        
	        if(answer.length() == 0){
	            answer = "a";
	        }
	        
	        
	        if(answer.length() >= 16){
	            answer = answer.substring(0,15);                      
	           
	        }
	        
	        
	         if(answer.endsWith(".")){
	                answer = answer.substring(0,answer.length()-1);
	        }
	        
	        
	        
	        if(answer.length() == 2){
	              answer += answer.charAt(1);
	        }else if(answer.length() == 1){
	              answer += answer.charAt(0);
	              answer += answer.charAt(0);     
	        }        
	        
	        
	        
	         return answer;
	    }      
	}
}

//substring을 이용할 때 숫자로 써주는 거 보다 길이 예외가 생기지 않게 length를 이용해서 자를것.
//startsWith,endsWith는 String에서 처음,끝의 어떤 문자가 들어 있는지 true,false로 반환 해준다.
//소문자로 변환할땐 toLowerCase(), 대문자로 변환 할땐 toUpperCase()를 이용해라.