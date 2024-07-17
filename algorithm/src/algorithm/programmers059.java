package algorithm;

public class programmers059 {

	public static void main(String[] args) {
		Solution059 s=new Solution059();
		String answer=s.solution(new int[] {1, 3, 4, 6});
		System.out.println(answer);
	}

}
class Solution059 {
    public String solution(int[] food) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            if(food[i]>=2){
                for(int j=0; j<food[i]/2; j++){
                    sb.append(i);
                }
            }
        }
        
        String sbReverse=sb.reverse().toString();
        
        return sb.reverse().append("0").append(sbReverse).toString();
    }
}