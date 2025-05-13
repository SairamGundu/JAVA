class PreIncremet {

    public static void main(String[] args)

    {
        // int a = 10;
        // ++a;
        // System.out.println(a);

        // int c = 22;
        // int d = ++c;
        // System.out.println(c);
        // System.out.println(d);

        // int b= a++;
        // System.out.println(b);

        int b = 15;
        int c = 23;
        int d = ++b - c++ * b + c++ * ++b;
        b = ++c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);

    }

}