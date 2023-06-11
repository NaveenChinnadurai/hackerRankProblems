package hackerRank;

import java.util.*;

/* 
You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully 
converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
 */
public class intToStr {
    public static void main(String[] args) {
        Scanner newin=new Scanner(System.in);
        int n=newin.nextInt();
        String str;
        try {
            str=Integer.toString(n);
            System.out.println("Good job");
            System.out.println(str);
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
        newin.close();
    }
}
