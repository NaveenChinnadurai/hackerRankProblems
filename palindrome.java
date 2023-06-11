package hackerRank;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner newin=new Scanner(System.in);
        String str=newin.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                count+=1;
                if(count==str.length()){
                    System.out.println("Yes");
                }
            }
            else{
                System.out.println("No");
            }
        }
        newin.close();
    }
}
