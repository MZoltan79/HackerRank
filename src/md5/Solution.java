package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Solution {

	public static void main(String[] args) throws NoSuchAlgorithmException {

	    String password = "HelloWorld";
	         
//	    MessageDigest md = MessageDigest.getInstance("SHA-256"); // works the same way!!!
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(password.getBytes());
	    byte[] digest = md.digest();
	    String myHash = DatatypeConverter
	      .printHexBinary(digest).toLowerCase();
	    System.out.println(myHash);
		
	}

}
