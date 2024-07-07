package Syntax;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaRegEx {
    private static boolean isPalindrome(long n) {
        StringBuilder str = new StringBuilder(Long.toString(n));
        return str.toString().equals(str.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String reId = "^B\\d{2}DC[A-Z]{2}\\d{3}$";
//        String id = "";
//        while (true) {
//            System.out.print("Enter Id: ");
//            id = scanner.nextLine().toUpperCase();
//            if (id.matches(reId)) {
//                break;
//            }
//            System.err.println("Enter again!!");
//        }
//        System.out.println("Id: " + id);
//        String name;
//        String reName = "[a-zA-Z ]+";
//        while (true) {
//            System.out.print("Enter Name: ");
//            name = scanner.nextLine();
//            if (name.matches(reName)) {
//                break;
//            }
//            System.err.println("Enter again!!");
//        }
//        System.out.println("Name: " + name);
        System.out.println(isPalindrome(2));
        StringBuilder str = new StringBuilder("Ha Noi dem");
        str.append(" lanh");
        str.insert(7, "ve ");
        System.out.println(str);
        StringTokenizer s = new StringTokenizer("I am sample string and will be tokenized on space");
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }
}
