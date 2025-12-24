package MyPackage;

public class PrintArray {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}