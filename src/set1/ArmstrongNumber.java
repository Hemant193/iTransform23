package set1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 2;
		
		//int leng = String.valueOf(num).length();
		
		int len = order(num);
		
		if (armstrong (num, len))
	        System.out.println(num + " is armstrong");
	    else
	        System.out.println(num + " is not armstrong");

	}
	// method to get the order of the number
	static int order(int n) {
		int len = 0;
		
		while(n > 0) {
			n = n/10;
			len++;
		}
		return len;
	}
	
	// method to check if the number is Armstrong or not
	static boolean armstrong(int num, int length) {
		
		int sum = 0;
		int temp, digit;
		
		temp = num;
		
		while(temp != 0) {
			digit = temp % 10;
			sum = sum + (int)Math.pow(digit, length);
			temp /= 10;
		}
		
		return num == sum;
	}

}
