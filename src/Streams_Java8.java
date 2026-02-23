import java.util.*;
import java.util.stream.Collectors;

public class Streams_Java8 {
    public static void main(String[] args) {

        String s = "aabcccddA";
        System.out.println(s.toCharArray());

        Map<Character, Long> freq = s.chars() // IntStream of Unicode code points (UTF-16 units)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freq);

        /*List<String> names = Arrays.asList("Reenu", "Ani", "Akhil", "Dev");
        names.stream()
                .filter(n->n.length()>3)
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);
*/
        var nums = List.of(1,2,3,4,50,70,23,45,12,90);
        //Find max number.
        //var list = new ArrayList<String>(); // Inferred as ArrayList<String>

         Optional<Integer> maxNum = nums.stream()
                .max(Comparator.naturalOrder());
        System.out.println("Max Num: "+ maxNum.get());

        //Find min number.
        Optional<Integer> minNum = nums.stream()
                .min(Comparator.naturalOrder());
        System.out.println("Min num: " + minNum.get());

        //Sum of even numbers.
        Optional<Integer> sum = nums.stream()
                .filter(n->n%2==0)
                .reduce(Integer::sum);
        sum.ifPresent(integer -> System.out.println("Sum = " + integer));

        //Find average.
        if(sum.isPresent()){
            int avg = sum.get()/nums.size();
            System.out.println("Average is: " + avg);
        }

        //Count frequency of a specific number.

        //Join list of strings with comma.

        //Group numbers by even/odd.

        //Partition numbers by > 5.

        //Find second highest number.

        //Find duplicate elements.
    }
}

/*Do this using streams:
Convert all to uppercase
Filter names with length > 3
Collect into List
* */
/*
* 🟢 Level 1 — Basic Filtering & Mapping

Given list of integers, return squares of odd numbers.
* num.stream().filter(n->n%2==0).map(n->n*n);

Count how many numbers are > 10.  * num.stream().filter(n->n>0).forEach(System.out::println);

Convert list of strings to uppercase. var names = List.of("abc", "dgc"); names.stream().map(String::toUpperCase());

Remove null values from list. --> dont know

Find first element divisible by 7.  num.stream().filter(n->n%7==0).findFirst().forEach(System.out::println);

Get distinct numbers. num.stream().distinct().forEach(System.out::println);

Sort numbers descending. num.stream().sorted().forEach(System.out::println);

Limit first 3 elements.  num.stream().limit(3).forEach(System.out::println);

Skip first 2 elements. num.stream().skip(2).forEach(System.out::println);

Check if all numbers are positive. dont know how to check? but can filter them and print them.
* */




/*var nums = List.of(

* */