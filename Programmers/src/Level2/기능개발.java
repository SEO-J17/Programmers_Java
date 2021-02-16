package Level2;
import java.util.*;
import java.io.*;
import java.math.*;
public class 기능개발 {
	class Solution {
	    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
	        ArrayList <Integer> list = new ArrayList<>();
	        Queue<Integer> qu = new LinkedList<>();
	        for(int i=0; i < speeds.length; i++){
	           int day = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
	            qu.offer(day);
	        }
	        int cnt=1;
	        int temp = qu.poll();
	        while(!qu.isEmpty()){     
	                if(temp >= qu.peek()){
	                     cnt+=1;
	                     qu.poll();
	                }else{
	                    list.add(cnt);
	                    cnt = 1;      
	                    temp = qu.poll();
	                }            
	            
	            if(qu.isEmpty()){
	                list.add(cnt);
	                break;
	            }            
	         
	        } 
	           return list;  
	        }                              
	    }
}
//정수끼리 나눗셈은 올림이 되질 않아 캐스팅을 해줫어야함.
//Math.round로 0.4를 더해 반올림하는 방법도 있지만 무조건 올려야 하므로 Math.ceil을 이용하는게 관건이다.
//Math.ceil()은 double형으로 무조건 올림값으로 만든다. -1.3이면 -1.0, 2.3 이면 3.0 으로 올림값을 해주는 함수이다.




