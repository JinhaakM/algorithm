package algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class programmers044 {

	public static void main(String[] args) {
		Solution044 s=new Solution044();
		int[] answer=s.solution(new int[] {5,0,2,7});
		System.out.println(Arrays.toString(answer));
	}

}

class Solution044 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
                
        return set.stream().sorted().mapToInt(z->z).toArray();
    }
}