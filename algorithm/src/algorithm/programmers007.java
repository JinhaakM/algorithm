package algorithm;

public class programmers007 {

	public static void main(String[] args) {
		Solution007 s=new Solution007();
		long answer=s.solution(5,3);
		System.out.println(answer);
	}

}
class Solution007 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) {
            answer= a;
        }
        else{
            for(int i=Math.min(a,b); i<= Math.max(a,b); i++){
                answer+=i;
            }
        }
        return answer;
    }
}
