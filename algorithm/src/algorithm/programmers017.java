package algorithm;

public class programmers017 {

	public static void main(String[] args) {
		Solution017 s=new Solution017();
		int[] absolutes= {4,7,12};
		boolean[] signs= {true,false,true};
		int answer=s.solution(absolutes, signs);
		System.out.println(answer);
	}

}
class Solution017 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length; i++){
            if(signs[i]==true) answer+=absolutes[i];
            else answer+=(-absolutes[i]);
        }
        return answer;
    }
}