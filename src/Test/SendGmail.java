package Test;

import Library.Util;
public class SendGmail {
    /*
            first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
 */
    public static void main(String[] args) {
        // credentials
        String userName = "iconly1@gmail.com";
        String passWord = "iotkjvwaofylvhii";
        // email:
        String[] receivers = {
                "iconly1@gmail.com"
        };
        String subject = "Ian Test";
        String text = "test test";
        int times = 5;
        int count  = 1;
        while(times > 0){ //send the email multiple time
            for( String each : receivers ){  // for sending emails to multiple people
                System.out.println("Sending to: "+each  );
                Util.sendEmails(userName,passWord,each, subject,text);
            }
            System.out.println(count++);
            times--;
        }

        System.out.println("Completed");
    }
}




