
public class Gayi {

	public static void main(String[] args) {
		
		System.out.println(Gayi.checkSpeed(85, true));
		

	}
	
	public  static int checkSpeed(int speed, boolean isbirthDay) {
		if(isbirthDay == false) {
			if(speed<=60) return 0;
			if(speed>=61 && speed<=80) return 1;
			if(speed>=81) return 2;
		}
		else {
			if(speed<=60+5) return 0;
			if(speed>=61+5 && speed<=80+5) return 1;
			if(speed>=81+5) return 2;
			
		}
		return 0;
		
	}

}
