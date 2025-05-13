import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int b = s.nextInt();

        String[] arr = new String[b];

        for (int i = 0; i < b; i++)

        {

            System.out.print("enter the value of index " + i + ":");

            arr[i] = s.next();

        }

        System.out.println("");
        System.out.println("Number of elemets in array are: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " Element in an array is = " + arr[i]);
        }

    }
}