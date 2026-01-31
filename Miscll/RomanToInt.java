package Miscll;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCDLXXVI";
        System.out.println("romanToInt  " + romanToInt(s) );
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num= 0;
        int digit =0;
        int i = 0;
        for( i =s.length()-1; i>0; i--){
            char ch = arr[i];
            digit = map.get(ch);

            if(ch == 'V' && arr[i-1] == 'I')
            {
                digit = 4;
                i--;
            } else
            if(ch == 'X' && arr[i-1] == 'I')
            {
                digit = 9;
                i--;
            } else
            if(ch == 'L' && arr[i-1] == 'X')
            {
                digit = 40;
                i--;
            }else if(ch == 'C' && arr[i-1] == 'X')
            {
                digit = 90;
                i--;
            }
            else if(ch == 'D' && arr[i-1] == 'C')
            {
                digit = 400;
                i--;
            }
            else if(ch == 'M' && arr[i-1] == 'C')
            {
                digit = 900;
                i--;
            }
            num += digit;

        }
        if(i==0){
            digit = map.get(arr[i]);
            num += digit;
        }


        return num;

    }
}

