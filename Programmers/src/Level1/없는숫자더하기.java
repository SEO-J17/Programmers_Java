package Level1;

import java.io.*;
import java.util.*;

public class 없는숫자더하기 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 45;

	        for(int i = 0; i < numbers.length; i++){
	            for(int j = 0; j < 10; j++){
	                if(numbers[i] == j){
	                    answer -= j;
	                    break;
	                }
	            }
	        }

	        return answer;
	    }
	}
}
