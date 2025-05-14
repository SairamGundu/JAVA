package Inheritanece.constructors;

class Child extends parent {
    // Static Block
    static {
        System.out.println("Child Static Block");
    }

    // Non-Static Block
    {
        System.out.println("Child Non-Static Block");
    }

    // Constructor
    public Child() {
        System.out.println("Child Constructor");
    }
}