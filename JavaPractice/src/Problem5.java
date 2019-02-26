
public class Problem5 {
    public static void main(String[] args){
        short num1 = Short.parseShort(args[0]);
        if ((num1 & 1) == 0){
            System.out.print("The input "+ args[0] + " is even number");
        } else {
            System.out.print("The input "+ args[0] + " is odd number");
        }
    }
}
