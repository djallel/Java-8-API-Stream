package Java8Streams;

import java.util.Scanner;

public class Twin_string {
    /*
    Statement
    A twin of a word is a word written with the same letters (case insensitive) but not in the same order.
    For example Silent is a twin of Listen.
    The isTwin(a, b) method should return true if b is the twin of a and false otherwise. a and b are two non-null strings.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2;

        //insert two string
        System.out.print("Insert the first string: ");
        str1 = input.nextLine();
        System.out.print("Insert the second string: ");
        str2 = input.nextLine();

        //print the result of the isTwin method
        System.out.println("Result of isTwin method: " +isTwin(str1, str2));
    }

    public static boolean isTwin(String a, String b) {
        //make lower both strings
        a = a.toLowerCase();
        b = b.toLowerCase();

        //check if the two strings are twins
        if (a.length() != b.length())
            return false;
        else
            for (int i = 0; i < a.length(); i++)
            {
                String check_car = a.charAt(i) +"";
                if (b.contains(check_car))
                    b = b.replace(check_car, "");
            }

        if (b.length() == 0)
            return true;
        else
            return false;
    }
}
