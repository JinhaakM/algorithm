package algorithm;

public class programmers039 {

	public static void main(String[] args) {
		Solution039 s=new Solution039();
		String answer=s.solution("a B z", 4);
		System.out.println(answer);
	}

}
class Solution039 {
    public String solution(String s, int n) {
        //A는 65, Z는 90
        //a는 97, z는 122
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                if(s.charAt(i)+n>90){
                    answer+=(char)(s.charAt(i)-(26-n));
                }else{
                    answer+=(char)(s.charAt(i)+n);
                }
            }else{
                if(s.charAt(i)==' '){
                    answer+=" ";
                }else{
                    if(s.charAt(i)+n>122){
                        answer+=(char)(s.charAt(i)-(26-n));
                    }else{
                        answer+=(char)(s.charAt(i)+n);
                    }
                }
            }
        }
        return answer;
    }
}