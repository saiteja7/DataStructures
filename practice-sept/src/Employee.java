import java.util.Objects;

public class Employee {
	
	String name;
	private String designation;
	private double salary;
	public String insuranceScheme;
	
	public Employee(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		test1();
	}
	public static void test1() {
		System.out.println("hello static called");
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		this.insuranceScheme =this.calculateInsurance(salary);
		
		
	}
	
	public double getSalary() {
		return this.salary;
		
	}
	private String calculateInsurance(double salarys) {
		
		if(salary>5000 && salary <20000) {
			return "scheme-c";
		}
		if(salary>=20000 && salary <40000) {
			return "scheme-b";
		}
		if(salary>=40000) {
			return "scheme-a";
		}
		
		return "no scheme";
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, insuranceScheme, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(insuranceScheme, other.insuranceScheme)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", insuranceScheme="
				+ insuranceScheme + "]";
	}
	

}
