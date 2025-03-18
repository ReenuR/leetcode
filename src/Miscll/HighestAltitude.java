package Miscll;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gains = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gains));

    }
    public static int largestAltitude(int[] gains) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for(int i=0; i<gains.length; i++){
            currentAltitude += gains[i];
            maxAltitude = Math.max(maxAltitude,currentAltitude);
        }
        return maxAltitude;
    }

}
