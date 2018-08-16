
public class test {

	public static void main(String[] args) {
		int scores[] = {1,4,5,6,7,8};
		test.scoresAverage(scores);
		
	}

	public static void scoresAverage(int[] scores) {
		int count = 0;
		for(int i = 0; i<scores.length/2; i++) {
			count = count +scores[i];
			
			
		}
		System.out.println(count);
		System.out.println();
	}
}
