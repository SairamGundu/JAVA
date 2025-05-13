class PreDecremet {

    public static void main(String[] args) {
        // int a = 10;
        // --a;
        // System.out.println(a);

        int b = 10;
        int a = 11;
        int c = --b + a-- * a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = 10;
        b = 16;
        c = 18;
        a = c++ * ++a + a++ - b++ - --b + --a * a++ + ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
