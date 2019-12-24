package priorityqueue;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	double cgpa;
	
	public Student(int id, String name, double cgpa)  {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student o) {
		if(cgpa == o.getCgpa()) {
			if(name.compareTo(o.getName()) == 0) {
				if(id < o.getId()) {
					return -1;
				} else {
					return 1;
				}
				
			} else {
				return name.compareTo(o.getName());
			}
		} else if(cgpa > o.getCgpa()) {
			return -1;
		} else {
			return 1;
		}
	}
	
	

}
