package set1;

public class ArmstrongNumInRange {

	public static void main(String[] args) {

		// int leng = String.valueOf(num).length();

		int low = 100;
		int high = 999;

		System.out.println("Armstrong numbers between " + low + " and " + high + " are : ");

		for (int num = low; num <= high; num++) {

			int sum = 0;
			int temp, digit;
			int len = order(num);

			temp = num;

			while (temp != 0) {
				digit = temp % 10;
				sum = sum + (int) Math.pow(digit, len);
				temp /= 10;
			}

			if (sum == num) {
				System.out.println(num + " ");
			}
		}

	}

	static int order(int n) {
		int len = 0;

		while (n > 0) {
			n = n / 10;
			len++;
		}
		return len;
	}

}
