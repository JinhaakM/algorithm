package algorithm;

public class programmers038 {

	public static void main(String[] args) {
		Solution038 s=new Solution038();
		int answer=s.solution(new int[][] {{60,50},{30,70},{60,30},{80,40}});
		System.out.println(answer);
	}

}
class Solution038 {
    public int solution(int[][] sizes) {
        int width=0;
        int height=0;
        
        for(int[] size:sizes){
            width=Math.max(width,Math.max(size[0],size[1]));
            //큰 수 중 가장 큰 수
            height=Math.max(height,Math.min(size[0],size[1]));
            //작은 수 중 가장 큰 수
        }
        return width*height;
    }
}