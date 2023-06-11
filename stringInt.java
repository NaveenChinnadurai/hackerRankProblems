package hackerRank;

import java.util.*;

/* 
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 15 alphabetic characters, and each integer will be in 
the inclusive range from 0 to 999 .

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, 
you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 */
public class stringInt {
    public static void output(String str){
        char[] strArray=str.toCharArray();
        String dstr="";
        String dnum="";
        for(int i=0;i<strArray.length;i++){
            if(Character.isAlphabetic(strArray[i])){
                dstr+=strArray[i];
            }
            else if(Character.isDigit(strArray[i])){
                dnum+=strArray[i];
            }
            else{
                continue;
            }
        }
        dstr+=" ".repeat(15-dstr.length());
        System.out.println(dstr+"0".repeat(3-dnum.length())+dnum);
    }
    public static void main(String[] args){
        Scanner newin=new Scanner(System.in);
        String str1=newin.nextLine();
        String str2=newin.nextLine();
        String str3=newin.nextLine();

        output(str1);
        output(str2);
        output(str3);

        newin.close();
    }
}
