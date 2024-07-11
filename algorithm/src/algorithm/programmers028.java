package algorithm;

public class programmers028 {

	public static void main(String[] args) {
		Solution028 s=new Solution028();
		boolean answer=s.solution("a234");
		System.out.println(answer);
	}

}
class Solution028 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            for(int i=0; i<s.length(); i++){
                if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                    answer=false; break;
                }
            }
        }else answer=false;
        
        return answer;
    }
}