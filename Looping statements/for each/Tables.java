package Exceptions;

import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the table no.: ");

        int a = sc.nextInt();

        int b = 1;

        while (b <= a) {

            for (int i = 1; i <= 5; i++) {
                System.out.println(b + " x " + i + "=" + (b * i));
            }

            b++;
        }

    }

}
