package Miscll;

public class Basics {
    public static void main(String[] args) {
        System.out.println(largestNum(10,90,90));
        System.out.println(numDiv5and11(50));
        System.out.println(isValidTriangle(1, 2, 3));
    }

    private static boolean isValidTriangle(int num1, int num2, int num3) {
            return (num1+num2>num3 || num1+num3>num2 || num2+num3 > num1);
    }

    public static int largestNum(int a, int b, int c){
        if(a>b && a>c)
            return a;
        if(b>c && b>a)
            return b;
        return c;
    }
    public static String numDiv5and11(int num){
        if(num%5==0 &&num%11==0)
            return "Divisible by 5 and 11";
        return "Not Divisible";

    }
}
