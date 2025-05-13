class cube {
    public static void main(String[] args) {
        System.out.println("Main Start");
        int res = cube(12);
        System.out.println("Cube of res:  " + res);
        System.out.println("Main End");

    }

    public static int cube(int a) {
        return a * a * a;
    }
}
