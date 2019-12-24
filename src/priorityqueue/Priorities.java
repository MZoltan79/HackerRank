package priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
	
	List<Student> getStudents(List<String> events){
		List<Student> result = new ArrayList<>();
		PriorityQueue<Student> pq = new PriorityQueue<>();
		for(String s: events) {
			String[] tmp = s.split(" ");
			if(tmp.length > 1) {
				pq.add(new Student(Integer.parseInt(tmp[3]), tmp[1], Double.parseDouble(tmp[2])));
			} else {
				pq.poll();
			}
		}
		while(pq.size() > 0) {
			result.add(pq.poll());
		}
		return result;
	}

}
