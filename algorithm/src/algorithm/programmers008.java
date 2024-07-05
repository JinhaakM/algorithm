package algorithm;

import java.util.Arrays;

public class programmers008 {

	public static void main(String[] args) {
		Solution008 s=new Solution008();
		long answer=s.solution(118372);
		System.out.println(answer);
	}

}
class Solution008 {
    public long solution(long n) {

        String replaceStr="";
        String[] arrs=String.valueOf(n).split("");
        Arrays.sort(arrs);
        //Arrays.sort(arrs,Collections.reverseOrder());
        for(String arr:arrs){
           replaceStr=arr+replaceStr; 
           //replaceStr=replaceStr+arr;
        }
        
        return Long.parseLong(replaceStr);
    }
}