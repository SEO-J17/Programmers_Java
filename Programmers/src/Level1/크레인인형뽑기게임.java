package Level1;
import java.util.*;
import java.io.*;
public class 크레인인형뽑기게임 {
	public int solution(int[][] board, int[] moves) {
	    int answer = 0;
	    Stack<Integer> stack = new Stack<>();
	    stack.push(0);

	    for (int i=0; i < moves.length; i++) {
	      for (int j = 0; j < board.length; j++) {
	        if (board[j][i - 1] != 0) {
	          if (stack.peek() == board[j][i - 1]) {
	            stack.pop();
	            answer += 2;
	          } else {
	           stack.push(board[j][i - 1]);
	          }
	          board[j][i - 1] = 0;
	          break;
	        }
	      }
	    }
	    return answer;
	  }
/*	
	 @Test
	  public void 정답(){
	    Assert.assertEquals(4, solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
	    Assert.assertEquals(8, solution(new int[][]{{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}}, new int[]{1,5,3,5,1,2,1,4}));
	    Assert.assertEquals(0, solution(new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}, new int[]{1,5,3,5,1,2,1,4}));

	  }
	  */
}