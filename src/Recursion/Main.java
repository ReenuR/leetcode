package Recursion;

public class Main {
    public static void main(String[] args) {
        printNumbers(3);
    }
    public static void countdown(int n) {
        if (n == 0) { // base case
            System.out.println("Happy new year!");
        } else {
            System.out.println(n); // prologue
            countdown(n - 1); // recursive call
            // No operation in the epilogue
        }
    }
    public static void printNumbers(int n) {
        if (n < 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }

}
