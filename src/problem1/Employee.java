package problem1;

public class Employee {
	private static int id;
	private static String firstName;
	private static String lastName;
	private static double salary;
	private static String Name=firstName+lastName;
	//private static double annualSalary;
	
	public double annualSalary() {
		return this.salary*12;
	}
	
	
	public static String getName() {
		return Name;
	}
	public static void setName(String name) {
		Name = name;
	}
	/*public static double getAnnualSalary() {
		return annualSalary;
	}
	public static void setAnnualSalary(double annualSalary) {
		Employee.annualSalary = annualSalary;
	}*/
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee.id = id;
	}
	public static String getFirstname() {
		return firstName;
	}
	public static void setFirstname(String firstname) {
		Employee.firstName = firstname;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employee.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee []";
	}
	
	
	

}
