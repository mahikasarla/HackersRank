/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankstring;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author kasar
 */
public class HackerrankString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
        String  a = scan.nextLine();
        
        String b = scan.nextLine();
        HackerrankString h = new HackerrankString();
        h.isAnagram(a,b);
        
    }
    static void isAnagram(String a, String b)
    {
        StringBuilder s = new StringBuilder(a);
        //Initially setting status as true
        StringBuilder s1 = new StringBuilder(b);
        int count=0;
 
        boolean status = true;
 
        if(a.length() != b.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
            s.deleteCharAt(s.length()-1);
            count=count+1;
            if(a.length() != b.length()){
                s1.deleteCharAt(0);
                count=count+1;
            }
            
        }
        else
        {
            
 
            status = s.toString().equals(s1.toString());
        }
 
        //Output
 
        if(status)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println(s1+" and "+s+" are not anagrams");
        }
    }
}
