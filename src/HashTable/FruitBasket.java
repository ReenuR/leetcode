package HashTable;

import java.util.HashSet;

public class FruitBasket {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
    }
    public static int totalFruit(int[] fruits) {

        int maxLen = -1;

        HashSet<Integer> basket = new HashSet<>();
        int start = 0, end =0;
        for( int l = 0, r = 0;r<fruits.length; r++){
            int fruit = fruits[r];

            basket.add(fruit);

            while(basket.size()>2){
                basket.remove(fruits[l]);
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);

        }
        return maxLen;
    }
}
