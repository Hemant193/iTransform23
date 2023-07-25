package stringAssignments;

public class StringBuilderQuestion1 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("String Buffer ");

		String str1 = "is a peer class of String ";

		sb.append(str1);

		String str2 = "that provides much of ";

		sb.append(str2);
		
		String str3 = "the functionality of strings";
		
		sb.append(str3);

		System.out.println(sb);
	}

}
