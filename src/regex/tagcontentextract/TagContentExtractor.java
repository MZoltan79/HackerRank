package regex.tagcontentextract;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		String s1 = "<h1>Nayeem loves counseling</h1>";
		String s2 = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		String s3 = "<Amee>safat codes like a ninja</amee>";
		String s4 = "<SA premium>Imtiaz has a secret crush</SA premium>";
		
		String regex = "<(.+)>([^<]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s1);
		while(matcher.find()) {
			System.out.println(matcher.group(2));
		}
	}

}
