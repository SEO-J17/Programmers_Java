package Level1;

public class 擒熱曖偃熱諦窗撬 {
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        int even = 0;   //礎熱
	        int odd = 0;    //�汝�
	        
	        for(int i = left; i <=right; i++){
	            int num = 0;
	            for(int j = 1; j <= i; j++){
	                if(i % j == 0){
	                    num++;
	                }
	            }
	            if(num % 2 == 0){
	                even += i;
	            }else
	                odd -= i;
	        }
	        
	        answer = even + odd;
	        
	        return answer;
	    }
	}
}
