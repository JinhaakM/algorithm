package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers032 {

	public static void main(String[] args) {
		Solution032 s=new Solution032();
		int[] answer =s.solution(new int[] {4,4,4,3,3});
		System.out.println(Arrays.toString(answer));
	}

}
class Solution032 {
    public int[] solution(int []arrs) {
        List<Integer> list=new ArrayList<>();
        int before=-1;
        for(int arr:arrs){
            if(arr!=before){
                list.add(arr);
                before=arr;
            }
        }

        return list.stream().mapToInt(z->z).toArray();
    }
}