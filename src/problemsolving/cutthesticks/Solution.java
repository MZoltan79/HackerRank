package problemsolving.cutthesticks;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static Integer[] cutTheSticks(int[] arr) {
    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> resultList = new ArrayList<Integer>();
    	for(int i: arr) {
    		list.add(i);
    	}
    	int shortestStick = 0;
    	while(list.size() > 0) {
    		resultList.add(list.size());
    		shortestStick = list.stream().mapToInt(x -> x).min().getAsInt();
    		for(int i = list.size()-1; i >= 0; i--) {
    			list.set(i, list.get(i)-shortestStick);
    			if(list.get(i) == 0) list.remove(i);
    		}
    	}
    	Integer[] result = resultList.toArray(new Integer[resultList.size()]);
    	return result;
    	
    }
    
    static int shortestStick(int[] arr) {
    	return Arrays.stream(arr).min().getAsInt();
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(
    						new FileReader("sticks.txt"));
    	Scanner scanner = new Scanner(br);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        Integer[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }
        scanner.close();
        br.close();
    }
}
