class Lnot {

    public static void main(String[] args) {

        int a = 10, b = 10;

        boolean res = !(a == b);

        System.out.println(res);

        System.out.println(!(97 >= 'a'));

        System.out.println(!(10 > 20 && 10 < 20));

        System.out.println(!(false && false));

    }

}