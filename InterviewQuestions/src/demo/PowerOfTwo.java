package demo;

public class PowerOfTwo {

	public static void main(String[] args) {
		double number = 18;
		System.out.println(getPower(number));
	}

	public static boolean getPower(double num) {
		int x = 1; int i =1;
		if(num %2 != 0) { return false;
		}else {
			while(x<num){
			x= (int) Math.pow(2, i);
			i++;
			}
			return(x == num)? true : false;
			
		}
				
	}
}
