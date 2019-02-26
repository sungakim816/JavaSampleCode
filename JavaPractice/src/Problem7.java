
public class Problem7 {
    public static void main(String[] args){
        short num1 = Short.parseShort(args[0]);
        if (num1 / 1 < 10){
            System.out.print("ones");
        }else if (num1 / 10 < 10){
            System.out.print("tens");
        }else if (num1 / 100 < 10){
            System.out.print("hundreds");
        }else if (num1 / 1000 < 10){
            System.out.print("thousands");
        } else {
            System.out.print("out of range");
        }
    }
}
