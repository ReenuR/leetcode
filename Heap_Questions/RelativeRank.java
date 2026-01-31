package Heap_Questions;

public class RelativeRank {
    public static void main(String[] args) {
        System.out.println(findRelativeRanks(new int[]{5,4,3,2,1}));
    }
    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int maxScore = 0;
        for (int i = 0; i < n; i++) {
            maxScore = Math.max(maxScore, score[i]);
        }

        int[] score2Index = new int[maxScore + 1];

        for (int i = 0; i < n; i++) {
            score2Index[score[i]] = i + 1;
        }

        String[] ans = new String[n];

        int place = 1;

        for (int i = maxScore; i >= 0; i--) {

            if (score2Index[i] == 0) continue;

            int actualIndex = score2Index[i] - 1;
            if (place == 1) {
                ans[actualIndex] = "Gold Medal";
            } else if (place == 2) {
                ans[actualIndex] = "Silver Medal";
            } else if (place == 3) {
                ans[actualIndex] = "Bronze Medal";
            } else {
                ans[actualIndex] = String.valueOf(place);
            }
            place++;
        }

        return ans;
    }}
       /* int [] sortedArr = Arrays.copyOf(score, score.length);
        //Arrays.sort(sortedArr);

        Arrays.sort(sortedArr, Collections.reverseOrder());

        Map<Integer, String> ranking = new HashMap<>();
        String[] rankArr = new String[score.length];

        for(int i = 0; i< sortedArr.length; i++){
            if(i == 0)
                ranking.put(sortedArr[i], "Gold Medal");
            else if(i == 1){
                ranking.put(sortedArr[i], "Silver Medal");
            }else if(i == 2){
                ranking.put(sortedArr[i], "Bronze Medal");
            }
            else{
                ranking.put(sortedArr[i], String.valueOf(i+1));
            }
        }
        for(int i=0; i<score.length; i++){
            String rank = ranking.get(score[i]);
            rankArr[i] = rank;

        }
        return rankArr;
    }*/
