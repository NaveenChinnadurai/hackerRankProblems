package hackerRank;

import java.util.*;
/* 
Given a string s and two indices,start and end, print a substring consisting of all characters 
in the inclusive range from start to end-1. 

Input Format

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end .
 */

public class strPrblm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
        in.close();
    }
}
