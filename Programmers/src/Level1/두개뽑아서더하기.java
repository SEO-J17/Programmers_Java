package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {
	  public ArrayList<Integer> solution(int[] numbers) {
	        HashSet<Integer> set = new HashSet<>();             
	        for(int i=0; i<numbers.length-1; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                set.add(numbers[i]+numbers[j]);                    
	            }
	        }
	        ArrayList<Integer> list = new ArrayList<>(set);
	        Collections.sort(list);    
	        
	        return list;
	    }
}
//정수배열이 주어지고 두개씩 뽑아서 중복없이 값을 출력하는것.
//hashset을 이용하고 ArrayList로 바꾸는 과정중에 리턴 타입이 int[] 여서 다른 배열을 선언해 옮기느라 
//불필요한 상황 이었는데 리턴 타입을 ArrayList<Integer>로 바꾸면 해결되는 문제 였음.
//HashSet이 아닌 TreeSet을 이용하면 정렬과 삽입이 동시에 이루어지니 알아둘것.
