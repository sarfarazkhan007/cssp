/*
Name :-    SARFARAZ KHAN
Roll No :- 14CO42
Batch :-   3
Experiment 2 

 */

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
 
public class md5 
{
    public static String getMD5(String input) 
    {
        try 
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32)  
            {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) 
        {
            throw new RuntimeException(e);
        }
    }
 
    public static void main(String[] args) throws NoSuchAlgorithmException 
    {
        Scanner sc=new Scanner(System.in);        
        System.out.print("Enter the String :- ");
        String ip=sc.nextLine();
        System.out.println("\n\nMD5 converted String :- "+getMD5(ip));
    }
}
/*
OutPut:-

Enter the String :- hello


converted String :-  5d41402abc4b2a76b9719d911017c592
 
*/
