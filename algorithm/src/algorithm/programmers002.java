package algorithm;

public class programmers002 {

	public static void main(String[] args) {
		Solution002 s=new Solution002();
		int answer=s.solution("+1234");
		System.out.println(answer);
	}

}
class Solution002 {
    public int solution(String s) {
        int answer = 0;
        
        answer=Integer.parseInt(s);
        
        return answer;
    }
}