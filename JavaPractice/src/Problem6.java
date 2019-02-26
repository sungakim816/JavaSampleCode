
public class Problem6 {
    public  static void main(String[] args){
        if (Short.parseShort(args[0]) % 10 == 7){
            System.out.print(args[0] + " ends with seven");
        } else {
            System.out.print(args[0] + " does not ends with seven");
        }
    }
}
