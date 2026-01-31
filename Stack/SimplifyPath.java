package Stack;

import java.util.Stack;
//simplify it by converting ".." to the previous directory and removing any "." or multiple slashes.
public class SimplifyPath {
    public static void main(String[] args) {

        String str = "/home/user/Documents/../Pictures";  // op --> "/a/b/c"
        System.out.println("Simplfy path shoul be : '/home/user/Pictures' and answer is: " + simplifyPath(str) );

    }
    public static String simplifyPath(String path){
        Stack<String> stringStack =  new Stack<>();
        String [] splitStr = path.split("/");
        for(String str : splitStr){
            if(str.equals("..") && !stringStack.isEmpty()){
                stringStack.pop();
            }else if(!str.equals("") || !str.equals("."))
                stringStack.push(str);

            }
        return "/"  +   String.join("/", stringStack);
    }

}

 /*System.out.println(arr.length);

        String str2 = "apple,banana,orange,grape";
        String[] fruits = str2.split(",");

        String str2 = ",,,a,,,b,,,";
        String[] trail = str2.split(",", -1); // trail: ["", "", "", "a", "", "b", "", "", ""]
        String[] trail2 = str2.split(","); // trail: ["", "", "", "a", "", "b", "", "", ""]

        System.out.println(Arrays.toString(trail));
        System.out.println(Arrays.toString(trail2));


      /*  String str = "apple,banana,orange,grape";

        // Split by comma
        String[] fruits = str.split(",");
        System.out.println("Split by comma:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Split by comma with limit 2
        String[] limitedFruits = str.split(",", 2);
        System.out.println("\nSplit by comma with limit 2:");
        for (String fruit : limitedFruits) {
            System.out.println(fruit);
        }

        // Split by non-existent delimiter
        String[] noSplit = str.split(";");
        System.out.println("\nSplit by non-existent delimiter:");
        System.out.println(noSplit.length);
        System.out.println(noSplit[0]);*/