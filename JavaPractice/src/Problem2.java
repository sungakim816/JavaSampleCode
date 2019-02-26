
public class Problem2 {
    public static  void main(String[] args){
        if (Byte.parseByte(args[0]) >= 75){
            System.out.print("Passed");
        }else if (Byte.parseByte(args[0]) < 75){
            System.out.print("Failed");
        }
    }
}
