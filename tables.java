package hackerRank;

import java.util.*;
public class tables{
    public static void main(String[] args){
        Scanner newIn=new Scanner(System.in);
        int n=newIn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        } 
        newIn.close();
    }
    
}