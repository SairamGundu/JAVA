import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.print("Enter first number:");
        a[0] = sc.nextInt();
        System.out.print("Enter second number:");
        a[1] = sc.nextInt();
        System.out.print("Enter third number:");
        a[2] = sc.nextInt();
        System.out.print("Enter fourth number:");
        a[3] = sc.nextInt();
        System.out.print("Enter fifth number:");
        a[4] = sc.nextInt();

        System.out.println("");
        System.out.println("Number of elemets in array are: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " Element in an array is = " + a[i]);
        }

    }
}
