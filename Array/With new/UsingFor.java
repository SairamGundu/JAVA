public class UsingFor {
    public static void main(String[] args) {

        String[] s = new String[5];

        s[0] = "Sairam";
        s[1] = "Vijay";
        s[2] = "Ramesh";
        s[3] = "Mahesh";
        s[4] = "Priya";

        for (int i = 0; i < s.length / 2 + 1; i++) {
            System.out.println(s[i]);
        }

    }

}
