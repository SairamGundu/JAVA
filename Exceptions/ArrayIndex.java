package Exceptions;

public class ArrayIndex {

	 public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3, 4, 5};
	            System.out.println(numbers[5]);  // Index 5 is out of bounds (valid indices are 0 to 4)
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bound Exception ");
	        }
	        }
}
