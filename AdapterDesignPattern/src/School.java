
public class School {

	
	public static void main(String[] args) {
		PenAdapter a = new PenAdapter();
		AssignmentWork w = new AssignmentWork();
		w.setP(a);
		w.writeAssignment("hello");
	}
}
