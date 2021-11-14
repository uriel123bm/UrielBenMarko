import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int [] [] arr1 = new int[3][2];
        arr1[1][0] = 4;
       int[] [] arr2 = {{1,2,3} , {1,2,3} , {1,4}};
       arr1 [0] = arr2[2];
       System.out.println(arr2);
    }
}
