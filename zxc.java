import java.util.*;
public class Countchar{
public static String alphNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static String count(char c, String str) {
        String stringToReturn = Character.toString(c);
        for(char ch : str.toCharArray()) {
            if (ch == c) {
                stringToReturn += " *";
            }
        }
        return stringToReturn;
    }

    public static void countAndPrintAlphNum(String str) {
        String stringToTest = str.toUpperCase();
        Set<String> rows = new HashSet<String>();
        char[] alphNumArray = alphNum.toCharArray();
        for(char c : alphNumArray) {
            rows.add(count(c, stringToTest));
        }
        for(String row : rows) {
            System.out.println(row);
        }

    }

    public static void main(String[] args) {
        countAndPrintAlphNum("Hi There 123!");
    }
}
