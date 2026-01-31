package TwoPointers;

public class ValidWordAbbr {
    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("internationalization","i18n"));
    }
    public static boolean validWordAbbreviation(String word, String abbr) {

        //I need to expand abbr and check its equality with string.

        int j = 0;
        for (int i = 0; i < abbr.length(); i++, j++) {
            char ch = abbr.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch != word.charAt(j))
                    return false;
            }

            else if (Character.isDigit(ch)) {
                int digit = ch - '0';
                //check whether next ch is also a digit then add these 2 numbers
                if (i<abbr.length()-1 && Character.isDigit(abbr.charAt(i + 1))) {
                    digit *= 10;
                    digit += abbr.charAt(i + 1) - '0';
                    i++;
                }
                // move word pointer
                j = j + digit - 1;
            }
        }
        return true;
    }
}
