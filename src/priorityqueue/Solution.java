package priorityqueue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
    	BufferedReader br;
    	try {
			br = new BufferedReader(new FileReader("priorityqueue.txt"));
			Scanner scan = new Scanner(br);
			int totalEvents = Integer.parseInt(scan.nextLine());    
			List<String> events = new ArrayList<>();
			
			while (totalEvents-- != 0) {
				String event = scan.nextLine();
				events.add(event);
			}
			
			List<Student> students = priorities.getStudents(events);
			
			if (students.isEmpty()) {
				System.out.println("EMPTY");
			} else {
				for (Student st: students) {
					System.out.println(st.getName());
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}