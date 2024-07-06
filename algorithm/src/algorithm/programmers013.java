package algorithm;

import java.util.Arrays;

public class programmers013 {

	public static void main(String[] args) {
		Solution013 s=new Solution013();
		long[] answer=s.solution(10000000,1000);
		System.out.println(Arrays.toString(answer));
	}

}
class Solution013 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            answer[i]=(long)x*(i+1);
        }
        return answer;
    }
}