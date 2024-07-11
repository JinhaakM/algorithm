package algorithm;

import java.util.Arrays;

public class programmers025 {

	public static void main(String[] args) {
		Solution025 s=new Solution025();
		String answer=s.solution("Zbcdefg");
		System.out.println(answer);
	}

}
class Solution025 {
    public String solution(String s) {

        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        
        return new StringBuilder(String.valueOf(ch)).reverse().toString();
    }
}