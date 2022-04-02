import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}

public class ComparableTest {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al,new AgeComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
//		Set<Student> set = new HashSet<Student>();
//		set.add(new Student(101, "Vijay", 23));
//		set.add(new Student(101, "Vijay", 23));
//		set.add(new Student(106, "Ajay", 27));
//		set.add(new Student(105, "Jai", 21));
//		for (Student st : set) {
//			System.out.println(st.rollno + " " + st.name + " " + st.age);
//		}
		
//		
		
		String s1="test";
		String s2="test";
		String s3 = new String("test");
		System.out.println(s1==s3);
		

	}
}
class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.rollno==s2.rollno)  
return 0;  
else if(s1.rollno>s2.rollno)  
return 1;  
else  
return -1;  
}  
}  

class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  