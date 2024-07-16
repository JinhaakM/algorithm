package algorithm;

import java.util.HashMap;
import java.util.Map;

public class programmers058 {

	public static void main(String[] args) {
		Solution058 s=new Solution058();
		boolean answer=s.solution(new String[] {"119", "97674223", "1195524421"});
		System.out.println(answer);
		
	}

}
class Solution058 {
    public boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) 
            map.put(phoneBook[i], i);
        
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 1; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
}