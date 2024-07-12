package algorithm;

import java.util.Arrays;

public class programmers033 {

	public static void main(String[] args) {
		Solution033 s=new Solution033();
		int answer=s.solution(new int[] {1,3,2,5,4},9);
		System.out.println(answer);
	}

}
class Solution033 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int ds:d){
            if(budget-ds>=0){
                budget-=ds;
                answer++;   
            }
        }
        return answer;
    }
}