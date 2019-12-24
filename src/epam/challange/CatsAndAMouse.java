package epam.challange;

public class CatsAndAMouse {

	
	 static String catAndMouse(int x, int y, int z) {
		 if(Math.abs(z-x) > Math.abs(z-y)) return "Cat B";
		 if(Math.abs(z-x) < Math.abs(z-y)) return "Cat A";
		 return "Mouse C";
	    }

	public static void main(String[] args) {
		int[][] queries = new int[][] {{1, 2, 3},{1, 3, 2}};
		for(int[] i: queries) {
			System.out.println(catAndMouse(i[0], i[1], i[2]));
		}
		
	}

}
