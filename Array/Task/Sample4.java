import java.util.Scanner;

class Sample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int max = 0;
        max = n[0];
        for (int i = 0; i < n.length; i++) {
            // System.out.println("The entered numbers are at " +i+" is " +n[i]);

            if (n[i] > max) {
                max = n[i];

            }
        }

        System.out.println("The entered max number is " + max);
    }

}