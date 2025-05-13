class Radius {
    public static void main(String[] args) {
        System.out.println("class Main");
        double res = calculateArea(10);
        System.out.println("Area of circle is: " + res);

    }

    public static double calculateArea(double radius) {
        double pi = 3.14;
        return pi * radius * radius;
    }

}
