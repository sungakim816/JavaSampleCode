
public class FunctionSample {
    public static String get_second_word(String input){
        String[] arr_str = input.split(" ");
        return arr_str[1];
    }

    public  static void main(String[] args){
        for(String arg: args){
            System.out.println(get_second_word(arg));
        }
    }
}
