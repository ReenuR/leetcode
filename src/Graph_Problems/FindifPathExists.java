package Graph_Problems;

public class FindifPathExists {

    private boolean[] visited; // To keep track of visited nodes

    public boolean validPath(int n, int[][] edges, int start, int end) {
        // ToDo: Write Your Code Here.
        return false;
    }
    public static void main(String[] args) {
        FindifPathExists sol = new FindifPathExists();
        System.out.println(sol.validPath(4, new int[][]{{0,1},{1,2},{2,3}}, 0, 3)); // true
        System.out.println(sol.validPath(4, new int[][]{{0,1},{2,3}}, 0, 3));     // false
        System.out.println(sol.validPath(5, new int[][]{{0,1},{3,4}}, 0, 4));     // false
    }
}
