package epam.challange;

public class DrawingBook {
	
	static int pageCount(int n, int p) {
//		n = n % 2 == 0? n:n-1;
//        int fromTheFront = p % 2 == 0? p/2:(p-1)/2;
//        int fromTheEnd = p % 2 == 0? (n-p)/2:(n-p+1)/2;
//        
//		return Integer.min(fromTheFront, fromTheEnd);
		return Integer.min(p/2, (n-p)/2);
    }

	public static void main(String[] args) {
		int n = 21;
		int p =12;
		System.out.println(pageCount(n, p));
	}

}
