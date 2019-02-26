

public class SecondWord {

	public SecondWord() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_space_index = args[0].indexOf(' ');
        int second_space_index = args[0].substring(first_space_index+1).indexOf(' ');
        if (second_space_index == -1) {
            System.out.println(args[0].substring(first_space_index+1));
        }else{
            second_space_index += first_space_index;
            System.out.println(args[0].substring(first_space_index+1, second_space_index+1));
        }

        String[] words = args[0].split(" ");
        System.out.println(words[1]);

	}

}

