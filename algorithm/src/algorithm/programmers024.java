package algorithm;

public class programmers024 {

	public static void main(String[] args) {
		Solution024 s=new Solution024();
		int answer=s.solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2});
		System.out.println(answer);
	}

}
class Solution024 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer=answer+(a[i]*b[i]);
        }
        return answer;
    }
}