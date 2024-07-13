package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class programmers040 {

	public static void main(String[] args) {
		Solution040 s=new Solution040();
		System.out.println(Arrays.toString(s.solution("banana")));
	}
}
class Solution040 {
    public int[] solution(String s) {
        List<Integer> answer=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                answer.add(-1);
            }else{
                answer.add(i-map.get(s.charAt(i)));
            }
                map.put(s.charAt(i),i);
        }
        return answer.stream().mapToInt(z->z).toArray();
    }
}