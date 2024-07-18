package algorithm;

import java.util.Arrays;

public class programmers060 {

	public static void main(String[] args) {
		Solution060 s=new Solution060();
		String[] answer=s.solution(new String[] {"sun", "bed", "car"},1);
		System.out.println(Arrays.toString(answer));
	}

}
class Solution060 {
	
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings);
        Arrays.sort(strings,(o1,o2)->Character.compare(o1.charAt(n),o2.charAt(n)));
        return strings;
    }
}