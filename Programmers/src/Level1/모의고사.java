package Level1;

import java.util.ArrayList;

public class 모의고사 {
	class Solution {
	    public ArrayList <Integer> solution(int[] answers) {
	        int[] rank = new int [3];
	        String [] person = new String [3];
	        ArrayList <Integer> answer = new ArrayList<>();
	        person [0] = "12345";
	        person [1] = "21232425";
	        person [2] = "3311224455";
	        
	        for(int i=0; i<3; i++){
	            int index=0;
	            for(int j=0; j<answers.length; j++){
	                    if(Integer.valueOf(person[i].charAt(index)-'0') == answers[j]){
	                        rank[i]++;
	                        index++;
	                    }else
	                        index++;
	                                
	                if(index >= person[i].length())
	                    index = 0;                
	            }
	        }
	        
	        int max=-1;
	        for(int i=0; i<3; i++){
	            if(max < rank[i]){
	                max = rank[i];
	            }                          
	        }
	        
	        if(max == rank[0]) answer.add(1);
	        if(max == rank[1]) answer.add(2);
	        if(max == rank[2]) answer.add(3);
	    
	        return answer;
	    }
	}
}
//String에서 Integer로 바꿀땐 무조건 '0'을 빼줘야 한다. 아스키코드로 변형된다!!!!
