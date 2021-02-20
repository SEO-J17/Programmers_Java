package Level2;
import java.util.*;
import java.io.*;
public class 다리를지나는트럭 {
	class Solution {
	    public int solution(int bridge_length, int weight, int[] truck_weights) {        
	        Queue<Integer> qu = new LinkedList<>();        
	        int time = 0;
	        int sum=0;
	        for(int i=0; i<truck_weights.length; i++){
	            while(true){
	                if(qu.isEmpty()){
	                    qu.add(truck_weights[i]);
	                    time++;
	                    sum += truck_weights[i];
	                    break;
	                }else if(qu.size() == bridge_length){
	                    sum -= qu.poll();
	                }else{
	                    if(sum + truck_weights[i] > weight){
	                        time++;    
	                        qu.add(0);
	                    }else{
	                        qu.add(truck_weights[i]);
	                        sum+=truck_weights[i];
	                        time++;
	                        break;
	                    }
	                }
	                
	            }
	            
	        }
	        return time+bridge_length;
	    }
		}
	}
//17번~코드가 핵심이었음


