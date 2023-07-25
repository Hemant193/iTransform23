package stringAssignments;

public class StringBuilderQuestion2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("it is used to _ at the specified index position");

		StringBuilder str = sb.replace(13, 15, " insert text");
		
		System.out.println(str);
		
	}

}
