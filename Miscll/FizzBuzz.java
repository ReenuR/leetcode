package Miscll;

public class FizzBuzz {
    public static void main(String[] args) {
        int i =1;
        while(i<=100){
            if(i%3==0 && i%5==0){
                System.out.print(" Miscll.FizzBuzz ");}
                else
                    if(i%3 ==0 ){
                    System.out.println(" Fizz ");
                } else if (i%5 == 0) {
                        System.out.println(" Buzz ");
                    }
            System.out.print(" " +i);
                    i++;
        }
    }
}
