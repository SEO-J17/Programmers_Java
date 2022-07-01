package Level2;

public class 단체사진찍기 {
	class Solution {
	    int answer = 0;
	    String people[] = {"A","C","F","J","M","N","R","T"};
	    public int solution(int n, String[] data) {
	        boolean visit[] = new boolean [8];
	        calc("",visit,data);
	        return answer;
	    }
	    
	    private void calc(String str, boolean[] visit, String[] data){
	        if(str.length() == 7){
	            if(check(str,data)){
	                answer++;
	            }
	            return;
	        }
	        for(int i = 0; i < 8; i++){
	            if(!visit[i]){
	                String temp = str + people[i];
	                visit[i] = true;
	                calc(temp, visit, data);
	                visit[i] = false;
	            }
	        }
	    }
	    
	    private boolean check(String str, String[] data){
	        for(String s : data){
	            int pos1 = str.indexOf(s.charAt(0));
	            int pos2 = str.indexOf(s.charAt(2));
	            char op = s.charAt(3);
	            int idx = s.charAt(4) - '0';
	            
	            if(op == '='){
	                if(!(Math.abs(pos1 - pos2) == idx + 1)){
	                    return false;
	                }
	            } else if(op == '>'){
	                if(!(Math.abs(pos1 - pos2) > idx + 1)){
	                    return false;
	                }
	            } else if(op == '<'){
	                if(!(Math.abs(pos1 - pos2) < idx + 1)){
	                    return false;
	            }     
	        }         
	    }
	        return true;
	    }
	}
}
