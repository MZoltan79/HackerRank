package problemsolving.pdfviewer;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	int result = 0;
    	for(Character ch: word.toCharArray()) {
    		int index = Character.getNumericValue(ch)-10;
    		if(h[index] > result) {
    			result = h[index];
    		}
    	}
        return result*word.length();
    }


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(
    						new FileReader("pdfviewer.txt"));
    	Scanner scanner = new Scanner(br);

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(String.valueOf(result));

        scanner.close();
        
    }
}
