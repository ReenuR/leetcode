package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateBinaryNumbers(7)));
    }
    public static String[] generateBinaryNumbers(int n) {
        String[] res = new String[n];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for(int i =0; i<n; i++){
            res[i] = String.valueOf(queue.remove());
            queue.add((Integer.parseInt(res[i])*10) );
            queue.add((Integer.parseInt(res[i])*10)+1);
        }

        return res;
    }
}
