package string.intro;

public class Solution {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		
		System.out.println(a.length()+b.length());
		System.out.println(a.compareTo(b) > 0?"Yes":"No");
		System.out.println(a.replaceFirst(a.substring(0,1),a.substring(0,1).toUpperCase()) + " "  + 
				b.replaceFirst(b.substring(0,1),b.substring(0,1).toUpperCase()));

	}

}
