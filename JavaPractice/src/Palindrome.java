
import java.util.Scanner;
public class Palindrome {
    public  static void main(String[] args){
        String reverse1 = "", user_input="";
        Scanner input = new Scanner(System.in);
        while (user_input!="0") {
            System.out.print("Enter a String: ");
            user_input = input.nextLine();
            for (int i = user_input.length() - 1; i >= 0; i--) {
                reverse1 += user_input.toLowerCase().charAt(i);
            }
            if (user_input.toLowerCase().equals(reverse1)) {
                System.out.print(user_input + " is a Palindrome");
            } else {
                System.out.print(user_input + " is Not a Palindrome");
            }
            System.out.println();
        }
        input.close();
    }
}

//#ZAYPOGI