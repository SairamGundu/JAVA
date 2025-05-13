class Widening {
    public static void main(String[] args) {
        int a = 20;
        int b = a;
        System.out.println(b);
        double d = a;
        System.out.println(d);
        float f = a;
        System.out.println(f);

        char c = 'b';
        char e = c;
        System.out.println(c);
        System.out.println(e);
        int i = c;
        double j = c;
        System.out.println(i);
        System.out.println(j);
        ;
    }
}