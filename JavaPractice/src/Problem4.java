
public class Problem4 {
    public static  void main(String[] args){
        if (Byte.parseByte(args[0]) < 75){
            System.out.print("Failed");
        }else if (Byte.parseByte(args[0]) >= 75 && Byte.parseByte(args[0]) <= 79){
            System.out.print("Removal");
        }else if (Byte.parseByte(args[0]) >= 80 && Byte.parseByte(args[0]) <= 99){
            System.out.print("Passed");
        }else if(Byte.parseByte(args[0]) == 100){
            System.out.print("Perfect");
        } else {
            System.out.print("Out of range");
        }
    }
}
