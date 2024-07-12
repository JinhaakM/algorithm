package algorithm;

public class programmers034 {

	public static void main(String[] args) {
		Solution034 s=new Solution034();
		int answer=s.solution(125);
		System.out.println(answer);
	}

}
class Solution034 {
	    public int solution(int n) {
	        StringBuilder threes = new StringBuilder(Integer.toString(n, 3));//1200
	        String reversedThree = threes.reverse().toString();//0021
	        int answer = Integer.parseInt(reversedThree,3);
	        return answer;
	    }
	}