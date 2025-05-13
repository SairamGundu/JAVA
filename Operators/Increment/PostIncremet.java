class PostIncremet {

    public static void main(String[] args) {
        int a = 10;
        int b = a++ + a++ - a++ * a++;
        a = b++ + a;

        int c = a++ + b++ / a++ * b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d);

    }
}
