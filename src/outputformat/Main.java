package outputformat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<1;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             System.out.printf("%-15s%d %n", s1,x);
         }
         System.out.println("================================");
         System.out.printf("%-30s%5d","this is a formatted float:", 50);
         sc.close();
	}

}
