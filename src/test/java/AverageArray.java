
public class AverageArray {

	public static void main(String[] args) {
		int scores[] = {1,15,14,5,4};
		AverageArray.scoresAverage(scores);
		AverageArray.scoresAverage1(scores);
		
		System.out.println(AverageArray.compare(scores));

	}
	public static int scoresAverage(int[] scores) {
		int count = 0;
		for(int i = 0; i<scores.length/2; i++) {
			count = count +scores[i];
			
		}
		return count/((scores.length)/2);
		
	}
	public static int scoresAverage1(int[] scores) {
		int count = 0;
		for(int i = scores.length/2; i<scores.length; i++) {
			count = count +scores[i];
			
		}
		return count/(scores.length-scores.length/2);
	}
	public static int compare(int[] scores) {
		if(AverageArray.scoresAverage(scores)>AverageArray.scoresAverage1(scores))
		return AverageArray.scoresAverage(scores);
		else
		return AverageArray.scoresAverage1(scores);
		
	}
}
