import java.util.Scanner;

public class Dablel {
    public static void main(String[] args) {
        int die, i;
        int[] freq = new int[6];
        for (i = 0; i < 1000; i++) {
            die = (int) (1 +6 * Math.random());
            freq[die - 1] = freq[die - 1] + 1;
        }
        for (int c = 1; c <= freq.length; c++) {
            System.out.println(c + " came up " + freq[c - 1] + " times");
        }
    }
}
