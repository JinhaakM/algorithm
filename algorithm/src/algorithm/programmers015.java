package algorithm;

public class programmers015 {

	public static void main(String[] args) {
		Solution015 s=new Solution015();
		String[] seoul= {"Jane","Kim"};
		String answer=s.solution(seoul);
		System.out.println(answer);
		
	}

}
class Solution015 {
    public String solution(String[] seoul) {
        
        int i=0;
        for(String findKim:seoul){
            if(findKim.equals("Kim")) break;
            else i++;
        }
        return "김서방은 "+i+"에 있다";
    }
}