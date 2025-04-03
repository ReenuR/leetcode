package Stack.MonotonicStack;

import java.util.*;

public class NGE_List {

        // Method to find the Next Greater Element (NGE) for each element in the list
        public static  List<Integer> nextLargerElement(List<Integer> arr) {
            int n = arr.size();
            Stack<Integer> s = new Stack<>();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                // Pop elements from the stack while they are smaller than the current element
                while (!s.isEmpty() && s.peek() < arr.get(i)) {
                    s.pop();
                }

                // If stack is not empty, set the next greater element
                if (!s.isEmpty()) {
                    res.add(s.peek());
                } else {
                    res.add(-1);
                }

                // Push current element onto stack
                s.push(arr.get(i));
            }

            return res;
        }

        public static void main(String[] args) {
            List<Integer> arr1 = Arrays.asList(11, 13, 21, 3);
            List<Integer> arr2 = Arrays.asList(4, 5, 2, 25);
            List<Integer> arr3 = Arrays.asList(13, 7, 6, 12);


            // Find and print the Next Greater Element (NGE) for each list
            System.out.println(nextLargerElement(arr1)); // Output: [13, 21, -1, -1]
            System.out.println(nextLargerElement(arr2)); // Output: [5, 25, 25, -1]
            System.out.println(nextLargerElement(arr3)); // Output: [-1, 12, 12, -1]
        }

}
/*
import java.util.*;

public class NextLargerElement {
    public static List<Integer> nextLargerElement(List<Integer> arr) {
        int n = arr.size();
        Stack<Integer> s = new Stack<>();
        Integer[] res = new Integer[n];
        Arrays.fill(res, -1); // Default to -1 if no greater element is found

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while they are smaller than the current element
            while (!s.isEmpty() && s.peek() < arr.get(i)) {
                s.pop();
            }

            // If stack is not empty, set the next greater element
            if (!s.isEmpty()) {
                res[i] = s.peek();
            }

            // Push current element onto stack
            s.push(arr.get(i));
        }

        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 2, 10, 8);
        System.out.println(nextLargerElement(arr)); // Output: [5, 10, 10, -1, -1]
    }
}



import java.util.*;

public class NextLargerElement {
    public static List<Integer> nextLargerElement(List<Integer> arr) {
        int n = arr.size();
        Stack<Integer> s = new Stack<>();
        Integer[] res = new Integer[n];
        Arrays.fill(res, -1); // Default to -1 if no greater element is found

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while they are smaller than the current element
            while (!s.isEmpty() && arr.get(s.peek()) < arr.get(i)) {
                res[s.pop()] = arr.get(i);
            }

            // Push current index onto stack
            s.push(i);
        }

        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 5, 2, 10, 8);
        System.out.println(nextLargerElement(arr)); // Output: [5, 10, 10, -1, -1]
    }
}

* */