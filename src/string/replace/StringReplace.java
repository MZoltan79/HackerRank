package string.replace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StringReplace {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
//		List<String> notLetters = Arrays.asList("!",",","?",".","_","@");
//        s = s.replace("'"," ");
//        for(String str: notLetters) {
//            s = s.replace(str,"");
//        }
        String[] resultArray = s.split("[ !,?._'@]+");
//        List<String> resultList = new ArrayList<>();
//        for(String str: resultArray) {
//        	if(str.length() != 0) {
//        		resultList.add(str);
//        	}
//        }
//        System.out.println(resultList.size());
//        resultList.forEach(str -> System.out.println(str));
        System.out.println(resultArray.length);
        for(String str: resultArray) {
        	System.out.println(str);
        }
		// TODO Auto-generated method stub

	}

}
