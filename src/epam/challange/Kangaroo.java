package epam.challange;

public class Kangaroo {
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 boolean firstJumpsLarger = v1 > v2? true:false;
		 while(true) {
			 if(x1 == x2) {
				 return "YES";
			 }
			 if(firstJumpsLarger && (x1 > x2)) {
				 return "NO";
			 } else if(!firstJumpsLarger && (x2 > x1)) {
				 return "NO";
			 }
			 x1 += v1;
			 x2 += v2;
			 
		 }
	    }


	public static void main(String[] args) {
		
		int x1 = 0;		// kangaroo 1's starting pos
		int v1 = 2;		// kangaroo 1's jump distance
		int x2 = 5;		// kangaroo 2's starting pos
		int v2 = 3;		// kangaroo 2's jump distance
		
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}

}
