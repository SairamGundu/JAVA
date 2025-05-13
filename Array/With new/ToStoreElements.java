class ToStoreElements {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 10;
        int a = 20;
        arr[1] = a;
        arr[2] = arr[0] + arr[1];
        arr[3] = 40;

        // to fetch the 1st element
        System.out.println("1st element= " + arr[0]);

        // to fetch the 2st element
        System.out.println("2nd element= " + arr[1]);

        // to fetch the last element
        System.out.println("last element= " + arr[arr.length - 1]);

    }
}