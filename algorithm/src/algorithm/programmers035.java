package algorithm;

public class programmers035 {

	public static void main(String[] args) {
		int answer=new Solution035().solution("10203", "15");
		System.out.println(answer);
	}

}
class Solution035 {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<=t.length()-p.length(); i++){
            String sum=t.substring(i,i+p.length());
            if(Long.parseLong(p)>=Long.parseLong(sum)) answer++;
        }

        return answer;
    }
}