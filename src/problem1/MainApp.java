package problem1;
import java.util.Scanner;
import problem2.Author;
import problem1.Employee;
import problem2.Book;
public class MainApp {

	private static String firstname;
	private static String lastName;
	private static double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);	
    Employee emp1=new Employee();

    System.out.println("Please Enter Your FirstName: ");
    
    firstname= sc.nextLine();    
    
    emp1.setFirstname(firstname);
    System.out.println("Please Enter Your LastName: ");
    lastName=sc.nextLine();
  
    System.out.println( emp1.getFirstname());
    emp1.setLastName(lastName);
    System.out.println(emp1.getLastName());
    System.out.println("Please Enter Your salary: ");
    sc.nextDouble();
    
	emp1.setSalary(salary);
	System.out.println(emp1.getSalary());
    System.out.println(emp1.annualSalary());

	}

}
