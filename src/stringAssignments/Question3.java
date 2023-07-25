package stringAssignments;

public class Question3 {

	public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of Strings which are in heap memory";
		
		System.out.println(str.toLowerCase());
		System.out.println("-------------------");
		
		System.out.println(str.toUpperCase());
		System.out.println("-------------------");
		
		System.out.println(str.replace('a', '$'));
		System.out.println("-------------------");
		
		System.out.println(str.contains("collection"));
		System.out.println("-------------------------");
		
		String s = "java string pool refers to collection of strings which are in heap memory";
		
//		if(str.equals(s)) {
//			System.out.println("good");
//		}
		
		System.out.println("-----------");
	}

}
