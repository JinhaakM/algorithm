package algorithm;

public class programmers010 {

	public static void main(String[] args) {
		Solution010 s=new Solution010();
		String answer=s.solution(9);
		System.out.println(answer);
	}

}
class Solution010 {
    public String solution(int num) {
        String answer = "";
        
        if(num%2==0) answer="Even";
        else answer="Odd";
        
        return answer;
    }
}