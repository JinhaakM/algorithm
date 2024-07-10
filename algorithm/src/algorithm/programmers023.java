package algorithm;

public class programmers023 {

	public static void main(String[] args) {
		Solution023 s=new Solution023();
		String melon=s.solution(3);
		System.out.println(melon);
	}

}
class Solution023 {
    public String solution(int n) {

        StringBuilder melon=new StringBuilder();
        
        for(int i=1; i<=n; i++){
            if(i%2==0) melon.append("박");
            else melon.append("수");
        }
        return String.valueOf(melon);
    }
}