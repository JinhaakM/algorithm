package algorithm;

import java.util.Stack;

public class programmers046 {

	public static void main(String[] args) {
		Solution046 s=new Solution046();
		int answer=
				s.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4} );
		System.out.println(answer);
	}

}
class Solution046 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>[] lanes=new Stack[board.length];
        for(int i=0; i<lanes.length; i++){
            lanes[i]=new Stack<>();
        }
        for(int i=board.length-1; i>=0; i--){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]>0) lanes[j].push(board[i][j]);
            }
        }
        Stack<Integer> bucket=new Stack<>();
        int answer=0;
        
        for(int move:moves){
            if(!lanes[move-1].isEmpty()){
                int doll=lanes[move-1].pop();
                if(!bucket.isEmpty()&&bucket.peek()==doll){
                    bucket.pop();
                    answer+=2;
                }else{
                    bucket.push(doll);
                }
            }
        }
        return answer;
    }
}