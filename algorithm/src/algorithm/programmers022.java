package algorithm;

public class programmers022 {

	public static void main(String[] args) {
		Solution022 s=new Solution022();
		String answer=s.solution("ssiiss");
		System.out.println(answer);
	}

}
class Solution022 {
    public String solution(String s) {
        String answer = "";
        int standard=0;
        
        if(s.length()%2==0) {
            standard=s.length()/2-1;
            answer=answer+s.charAt(standard)+s.charAt(standard+1);
        }else{
            standard=s.length()/2;
            answer+=s.charAt(standard);
        } 
        return answer;
    }
}