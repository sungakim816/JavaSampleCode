
public class Problem1 {
    public static  void main(String[] args){
        if (Short.parseShort(args[0]) % 2 == 0){
            System.out.print("The input "+ args[0] + " is even number");
        } else {
            System.out.print("The input "+ args[0] + " is odd number");
        }
    }
}
