
public class Problem3 {
    public static void main(String[] args){
        if (Short.parseShort(args[0]) > 0){
            System.out.print(args[0] + " is positive");
        }
        else if (Short.parseShort(args[0]) == 0){
            System.out.print("0 is neither positive of negative");
        }else if (Short.parseShort(args[0]) < 0){
            System.out.print(args[0] + " is negative");
        }
    }
}
