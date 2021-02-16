package Level2;
import java.util.*;
import java.io.*;
import java.math.*;
public class «¡∏∞≈Õ {
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
