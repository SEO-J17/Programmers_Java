  package Level1;

public class �űԾ��̵���õ {
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

//substring�� �̿��� �� ���ڷ� ���ִ� �� ���� ���� ���ܰ� ������ �ʰ� length�� �̿��ؼ� �ڸ���.
//startsWith,endsWith�� String���� ó��,���� � ���ڰ� ��� �ִ��� true,false�� ��ȯ ���ش�.
//�ҹ��ڷ� ��ȯ�Ҷ� toLowerCase(), �빮�ڷ� ��ȯ �Ҷ� toUpperCase()�� �̿��ض�.