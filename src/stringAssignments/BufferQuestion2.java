package stringAssignments;

public class BufferQuestion2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("it is used to _ at the specified index position");
		
		//sb.insert(13 , " insert into");
		
		sb.replace(13, 15, " insert text");
		
		System.out.println(sb);

	}

}
