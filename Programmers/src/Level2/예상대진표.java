package Level2;

public class 예상대진표 {
	class Solution{
	    public int solution(int n, int a, int b){
	        int answer = 0;
	        int first,end;
	        if(a > b){
	            first = b;
	            end = a;
	        }else{
	            first = a;
	            end = b;
	        }
	        
	        while(true){
	            if(first % 2 != 0 && end % 2 == 0 && end - first == 1){
	                answer++;
	                break;
	            }
	            answer++;
	            first = (first + 1) / 2;
	            end = (end +1) / 2;
	        }
	        

	        return answer;
	    }
	}
}
