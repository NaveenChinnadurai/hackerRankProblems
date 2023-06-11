package hackerRank;

import java.util.*;
public class strPrblm1 {
    public static void main(String[] args) {
        Scanner newin=new Scanner(System.in);
        String A=newin.nextLine();
        String B=newin.nextLine();
        System.out.println(A.length()+B.length());
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1, A.length())+" "+Character.toUpperCase(B.charAt(0))+B.substring(1, B.length()));
        newin.close();
    }
}
