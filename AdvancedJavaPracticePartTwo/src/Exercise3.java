/**
 *
 */


import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum;
        // Add values from corresponding slots of valA and valB
        // and put the result in the corresponding slot of sum.
        sum = IntStream.range(0, valA.length).map(i -> valA[i] + valB[i]).toArray();
        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
    }

}
