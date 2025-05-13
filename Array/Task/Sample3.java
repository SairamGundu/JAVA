import java.util.Scanner;

class Sample3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("enter the index " + i + " of an array :");

            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {

                sum = sum + arr[i];
            }
        }
        System.out.println("the sum of elemnts at even index" + sum);
    }
}