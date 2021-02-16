package Level2;
import java.util.*;
import java.io.*;
import java.math.*;
public class 프린터 {
		class Solution {
		    public int solution(int[] priorities, int location) {
		       PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
		       int cnt=0;
		        
		       for(int d : priorities)
		           qu.add(d);
		        
		       while(!qu.isEmpty()){
		           for(int i=0; i<priorities.length; i++){
		               if(qu.peek() == priorities[i]){
		                   qu.poll();
		                   cnt++;
		                   if(location == i){
		                     qu.clear();
		                     break;   
		                   }
		               }
		           }
		       }
		        return cnt;
		    }                                   
		}
}
//PriorityQueue는 우선순위로 자동으러 정렬되서 사용된다.
//이 문제는 크기가 큰것이 앞에 가야 함으로 컬렉션의 reverseOrder를 사용했다.