package epam.challange;


public class FormingAMagicSquare {
	
	static int formingMagicSquare(int[][] s) {
	    int[] m = {4,9,2,7,6,1,8,3};

	    int[] s1 = new int[8];
	    s1[0] = s[0][0];
	    s1[1] = s[0][1];
	    s1[2] = s[0][2];
	    s1[3] = s[1][2];
	    s1[4] = s[2][2];
	    s1[5] = s[2][1];
	    s1[6] = s[2][0];
	    s1[7] = s[1][0];

	    int min = 45;  // worst case when all zeros
	    for (int i=0; i<8; i++){    // select one matrix
	        int res = 0;

	        if (i < 4){
	            int j = Math.floorMod(i*2, 8);
	            for (int t = 0; t<8; t++){  // foreach element in the matrix
	                res += Math.abs(s1[t] - m[Math.floorMod(j+t,8)]);
	            }
	        } else {
	            // change orientation
	            int j = Math.floorMod(-i*2, 8);
	            for (int t = 0; t<8; t++){  // foreach element in the matrix
	                res += Math.abs(s1[t] - m[Math.floorMod(j-t,8)]);
	            }
	        }

	        // Calculate middle cost (5 is always present in center m(1,1) in all magic squares 3x3)
	        res += Math.abs(s[1][1] - 5);

	        if (res < min){
	            min = res;
	        }
	    }

	    return min;
	}

	public static void main(String[] args) {

		int[][] s = {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
//		int[][] t = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		int result = formingMagicSquare(s);
		System.out.println(result);
		int i = -1;
		int y = 2;
		System.out.println(i + " / " + y + " = " + i/y);
		System.out.println("floorDiv(" + i + ", " + y + ") = " + Math.floorDiv(i, y));
		System.out.println(i + " % " + y + " = " + i%y);
		System.out.println("floorMod(" + i + ", " + y + ") = " + Math.floorMod(i, y));
//		System.out.println(Math.floorDiv(i, y) == i/y);
//		System.out.println(Math.floorMod(i, y) == i%y);
		
	}

}
