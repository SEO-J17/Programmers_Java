package Level1;
public class 모의고사 {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] rank = new int [3];
	        String [] person = new String [3];
	        int[] answer = new int [3];
	        person [0] = "12345";
	        person [1] = "21232425";
	        person [2] = "3311224455";
	        
	        for(int i=0; i<3; i++){
	            int index=0;
	            for(int j=0; j<answers.length; j++){
	                if(index < person[i].length()){
	                    if(Integer.valueOf(person[i].charAt(index)) == answers[j]){
	                        rank[i]++;
	                        index++;
	                    }else
	                        index++;
	                }
	                if(index >= person[i].length())
	                    index = 0;                
	            }
	        }
	        
	        int max=0;
	        for(int i=0; i<2; i++){
	            if(rank[i] > rank[i+1]){
	                max = rank[i];
	            }else if(rank[i] < rank[i+1]){             
	                max = rank[i+1];                                                           
	            }
	        }
	        
	        if(max == rank[0]) answer[0] = 1;
	        if(max == rank[1]) answer[1] = 2;
	        if(max == rank[2]) answer[2] = 3;
	    
	        return answer;
	    }
	
	}
}
