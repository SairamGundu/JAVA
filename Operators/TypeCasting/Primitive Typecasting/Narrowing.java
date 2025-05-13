class Narrowing {

    public static void main(String[] args) {

        double d = 10.1234;
        int a = (int) d;
        float f = (int) d;

        System.out.println(d);
        System.out.println(a);
        System.out.println(f);

        long k = 12345678910l;
        int c = (int) k;
        System.out.println(k);
        System.out.println(c);

    }

}
