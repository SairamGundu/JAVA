
//to find even number in an array and add it
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int b = s.nextInt();
        int sum = 0;

        int[] a = new int[b];

        for (int i = 0; i < b; i++)

        {

            System.out.print("enter the value of index " + i + ":");

            a[i] = s.nextInt();

        }

        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(" Element in an array is even number is : " + a[i]);
                sum = sum + a[i];
            }
        }

        System.out.println("The Sum is : " + sum);

    }
}