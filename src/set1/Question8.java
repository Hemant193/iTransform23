package set1;

public class Question8 {

	public static void main(String[] args) {

		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47 };
		
		bubbleSort(arr);
		
		for(int n : arr) {
			System.out.println(n);
		}

	}

	static void bubbleSort(int[] arr) {
		int length = arr.length;
		
		int temp;
		
		for(int i = 0; i < length; i++) {
			for(int j = i; j < length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

} 