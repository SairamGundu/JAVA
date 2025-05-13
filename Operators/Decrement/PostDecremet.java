class PostDecremet {
    public static void main(String[] args) {
        int a = 10;
        a--;
        System.out.println(a);

        a = 12;
        a = a--;
        System.out.println(a);

        a = 15;
        int b = ++a;
        int c = b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}