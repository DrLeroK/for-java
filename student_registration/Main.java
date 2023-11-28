package student_registration;

import java.util.Scanner;

public class Main {
    // Name - Latera Dereje
    // ID - 3273/14
    //  To see the list of registered students after registration insert '0'

    public static void main(String[] args){
        boolean x = true;

        // creating new object from the studentInformation class
        var studentinformation = new studentInformation();
        System.out.println("                               WELCOME TO HARAMAYA UNIVERSITY'S REGISTRATION SYSTEM!!!");

        try (Scanner scanner = new Scanner(System.in)) {
            String input = "";

            while(x){
                
                 System.out.println("======================================");
                 System.out.println("================ MENU ================");
                 System.out.println("======================================");
                 System.out.println("press '1' to register.");
                 System.out.println("press '2' to see the registration report.");
                 System.out.println("Press '3' to see your slip.");
                 System.out.println("press '4' to exit the system.");
                 System.out.println("--------------------------------------");
                 System.out.print("please enter your choice: ");
                
                 input = scanner.next();
                 System.out.println("--------------------------------------");
                
                // we accsses different methods by choosing different method in the if statements

                if (input.equals("1")){
                    studentinformation.takeStudentInfo();
                }
                else if(input.equals("2")){
                    studentinformation.reportRegistrationInformation();
                    var admin = new Admin(studentinformation);
                    admin.admin();
                }

                else if(input.equals("3")){
                    studentinformation.showSlip();
                }

                else if(input.equals("4")){
                    System.out.println("System exit.");
                    System.exit(0);
                }

                else if (input.equals("0")){
                    Admin.printData();
                }

                else{
                    System.out.println("Please enter the right choice, your data has an input mismatch.");
                }
            }
                

            }
        }

    }
    

