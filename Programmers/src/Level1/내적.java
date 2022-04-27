package Level1;

public class ³»Àû {
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 0;

	        for(int i = 0; i < a.length; i++){
	            int temp = a[i]*b[i];
	            answer += temp;

	        }

	        return answer;
	    }
	}
}
