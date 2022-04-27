package problem1;
import java.util.Scanner;
import problem2.Author;
import problem1.Employee;
import problem2.Book;
public class MainApp {

	

		public static void main(String[] args) {
			
			Employee obj =new Employee(78978,"Manish","Yadav",5000);
			System.out.println(obj);
			Author au =new Author("Manish","jus6015manishyadav@gmail.com",'M');
			Book ob1=new Book("Gold",500.0,5,au);
			System.out.println(ob1);
		}

	}