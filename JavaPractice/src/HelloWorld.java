
/**
 * 
 */
import java.util.*;
/**
 * @author Sunga
 *
 */
public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        // Write your code here.
        String[] str_arr = s.split("[ !,?._'@]+");
        System.out.println(str_arr.length);
        for (String x: str_arr) {
            System.out.println(x);
        }
        scan.close();
    }
}