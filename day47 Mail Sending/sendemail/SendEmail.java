
package sendemail;


import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import java.util.Scanner;


public class SendEmail {

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Sender credentials (use your Gmail + App Password)
        final String fromEmail = "prasannakumarsooriya082001@gmail.com";
        final String password = "lvgl kdgg hazi ovzg";

        // Get input from user
        System.out.print("Sent To: ");
        String toEmail = sc.nextLine();

        System.out.print("Subject: ");
        String subject = sc.nextLine();

        System.out.print("Message: ");
        String messageText = sc.nextLine();

        // SMTP properties for Gmail
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // Create session
        Session session = Session.getInstance(props, new Authenticator() 
        {
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try 
        {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(messageText);

            // Send email
            Transport.send(message);

            System.out.println("Mail sent successfully!");

        } 
        catch (Exception e) 
        {
            System.out.println("Error: Mail not sent!");
            e.printStackTrace();
        }

        sc.close();
    }
    
}
