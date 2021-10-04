package Level2;

import java.io.*;
import java.util.*;
public class 문자열압축 {
	    public int solution(String s) {
	        int answer = 9999;
	        for(int i = 1; i <= s.length(); i++){
	            String temp = s.substring(0,i);
	            int cnt = 0;
	            String str=s;
	            for(int j=0; j< s.length(); j+=i){
	                if(j != 0 && (i+j) > s.length())
	                    break;
	                
	             if(temp == s.substring(j,i+j)){
	                 ++cnt;   
	            }else if(temp != s.substring(j,i+j)){
	                if(cnt == 1){
	                    str += temp;
	                }else
	                    str += cnt+temp;  
	                
	                cnt = 1;
	                temp = s.substring(j,i+j);              
	                
	            }
	        }
	            if(str.length() != 0)
	             answer = Math.min(answer, str.length());
	    }
	        return answer;
	    }
	}
