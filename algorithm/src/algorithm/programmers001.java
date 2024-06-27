package algorithm;

public class programmers001 {

	public static void main(String[] args) {
		Solution s=new Solution();
		boolean answer=s.solution("Pyy");
		System.out.println(answer);
	}
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s=s.toLowerCase();
        int yN=0;
        int pN=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='y') yN++;
            if(s.charAt(i)=='p') pN++;
        }
        if(yN==pN) answer=true;
        if(yN!=pN) answer=false;

        return answer;
    }
}
