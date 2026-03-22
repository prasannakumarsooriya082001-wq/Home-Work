
package otpverification;

import java.util.Scanner;


public class OTPVerification {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String systemOTP = "4589";
        
        System.out.print("Enter the OTP : ");
        String userOTP = sc.nextLine();
        
        if(systemOTP.equals(userOTP))
        {
            System.out.println("OTP Verified Successfully...");
        }
        else
        {
            System.out.println("Invalid OTP...");
        }
        System.out.println("Before Concat OTP is : "+ userOTP);
        
        userOTP.concat("1234");
        
        System.out.println("After concat OTP is : "+userOTP);
        System.out.println("Nothing will change because String is Immutable");
        
    }
    
}
