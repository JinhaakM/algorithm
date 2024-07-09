package algorithm;

public class programmers021 {

	public static void main(String[] args) {
		Solution021 s=new Solution021();
		String answer=s.solution("01011111111");
		System.out.println(answer);
	}

}
class Solution021 {
    public String solution(String phone_number) {
        String answer = "";
        int blind=phone_number.length()-4;
        
        for(int i=0; i<phone_number.length(); i++){
            if(i < blind) answer+="*";
            else answer+=phone_number.charAt(i);
        }
        return answer;
    }
}
//다른 사람 풀이.
class Solution021_1 {
	  public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	  }
	}