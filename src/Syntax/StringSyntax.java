package Syntax;

public class StringSyntax {
    public static void main(String[] args) {
        String name = "Dang      Duc                    Tai               ".trim();
        System.out.println(name.charAt(1));
        System.out.println(name.trim().toUpperCase());
        String s1 = "Lao dong";
        String s2 = "lao dong";
        String s3 = "Lao dong la ving quang Lao dong";
        String s4 = "LAO dOng";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s1.concat(" " + s2));
        System.out.println(s3.indexOf(s1));
        System.out.println(s3.lastIndexOf(s1));

        String example1 = "Example  method Split a line into        Words";
        String [] st1 = example1.split("\\s+");
        for (String i : st1) {
            System.out.println(i);
        }
        String example2 = "Who are you? Are you  pretty? Some have   called  you cute while others just call you pretty!";
        String [] st2 = example2.split("[\\.\\?\\!]");
        for (String i: st2) {
            System.out.println(i.trim() + ".");
        }
        String st3 = example2.replaceAll("\\s+", " ");
        System.out.println(st3);
        String ho = name.substring(0, name.indexOf(" "));
        String ten = name.substring(name.lastIndexOf(" "));
        System.out.println(ho + ten);
    }
}
