
public class String_StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "sailong";
		String string = string1 + "love";
		System.out.println(string1 == string);
		StringBuilder stringBuilder = new StringBuilder("abcd");
		System.out.println(stringBuilder.toString());
		stringBuilder.append("ef");
		System.out.println(stringBuilder.toString());
		stringBuilder.delete(0, 1);
		System.out.println(stringBuilder.toString());
		stringBuilder.insert(0, "a");
		System.out.println(stringBuilder.toString());
		
		stringBuilder.setCharAt(0, 'A');
		System.out.println(stringBuilder.toString());

		
	}

}
