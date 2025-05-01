package Miscll;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {

        int num = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'I' && i!= arr.length-1 && arr[i+1] == 'V'){
                num = num+4;
                i++;
            }

            if(arr[i] == 'I'&& i!= arr.length-1 && arr[i+1] == 'X'){
                num = num + 9;
                i++;
            }

            if(arr[i] == 'I')
                num = num + 1;
            if(arr[i] == 'X' && i!= arr.length-1 && arr[i+1] == 'L'){
                num = num + 40;
                i++;
            }
            if(arr[i] == 'X' && i!= arr.length-1 && arr[i+1] == 'C'){
                num = num + 90;
                i++;
            }
            if(arr[i] == 'X')
                num = num + 10;

            if(arr[i] == 'C' && i!= arr.length-1 && arr[i+1] == 'D'){
                num = num + 500;
                i++;
            }

            if(arr[i] == 'C' && i!= arr.length-1 && arr[i+1] == 'M'){
                num = num + 900;
                i++;
            }

            if(arr[i] == 'C')
                num = num + 100;
            if(arr[i] == 'V')
                num = num + 5;
            if(arr[i] == 'L')
                num = num + 50;
            if(arr[i] == 'D')
                num = num + 500;

            if(arr[i] == 'M')
                num = num + 1000;


        }
        return num;
    }
}
