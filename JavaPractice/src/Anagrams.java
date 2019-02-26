
import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String word1, String word2) {
        char[] strArray1 = word1.toCharArray();
        char[] strArray2 = word2.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        String sortedString1 = new String(strArray1);
        String sortedString2 = new String(strArray2);

        if (sortedString1.equals(sortedString2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){

        if (isAnagram(args[0].toLowerCase(), args[1].toLowerCase())){
            System.out.print(args[0] + " and " + args[1] + " is Anagram");
        }else{
            System.out.print(args[0] + " and " + args[1] + " is not an Anagram");
        }
    }
}
