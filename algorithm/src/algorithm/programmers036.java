package algorithm;

public class programmers036 {

	public static void main(String[] args) {
		Solution036 s=new Solution036();
		String answer=s.solution("try hello world");
		System.out.println(answer);
	}

}
class Solution036 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int even=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                answer.append(" ");
                even=0;
            }else{
                if(even==0||even%2==0){
                    answer.append(String.valueOf(s.charAt(i)).toUpperCase());
                    even++;
                }else{
                    answer.append(String.valueOf(s.charAt(i)).toLowerCase());
                    even++;
                }
            }
        }
        return answer.toString();
    }
}