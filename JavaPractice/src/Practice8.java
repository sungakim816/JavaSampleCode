
public class Practice8 {
    public static void main(String[] args){
        short num1 = 1;
        short index = 0;
        String[] places = new String[]{"ones", "tens", "hundreds", "thousands", "ten thousands", "hundred thousands", "millions", "ten millions"};

        while(true){
            if (Integer.parseInt(args[0]) / num1 < 10){
                break;
            }else{
                index += 1;
                num1 *= 10;
            }
        }
        System.out.print(places[index]);
    }
}
