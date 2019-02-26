
public class BubbleSort {
    static private String[] sort_array(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (String elements : arr) {
                System.out.print(elements + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] sorted_arr = sort_array(args);
        System.out.println("Final Answer: ");
        for (String elements : sorted_arr) {
            System.out.print(elements + " ");
        }
    }
}

