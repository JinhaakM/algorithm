package algorithm;

import java.util.Arrays;

public class programmers043 {

	public static void main(String[] args) {
		Solution043 s=new Solution043();
		String[] answer=s.solution(5, new int[] {9,20,28,18,11}, new int[] {30, 1, 21, 17, 28});
		System.out.println(Arrays.toString(answer));
	}

}
class Solution043 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str="";
        for(int i=0; i<n; i++){
            String first=Integer.toString(arr1[i],2);
            String second=Integer.toString(arr2[i],2);
            while(first.length()<n){
                first="0"+first;
            }
            while(second.length()<n){
                second="0"+second;
            }
            for(int j=0; j<n; j++){
                if(first.charAt(j)=='0'&&second.charAt(j)=='0'){
                    str+=" ";
                }else{
                    str+="#";
                }
            }
            answer[i]=str;
            str="";
        }
        return answer;
    }
}