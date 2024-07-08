package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers019 {

	public static void main(String[] args) {
		Solution019 s=new Solution019();
		int[] arr= {5,9,7,10};
		int[] answer=s.solution(arr, 5);
		System.out.println(Arrays.toString(answer));

	}

}
class Solution019 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answers=new ArrayList<>();
        Arrays.sort(arr);
        for(int arrs:arr){
            if(arrs%divisor==0){
                answers.add(arrs);
            } 
        }
        if(answers.size()==0) answers.add(-1);
        
        return answers.stream().mapToInt(z->z).toArray();
    }
}