package student_registration;

import java.util.InputMismatchException;
import java.util.Scanner;

public class studentInformation {
    public String firstName;
    public String lastName;
    public String idNo;
    public String gender;
    public int department;
    public String departmentChoice;
    public int dep;
    private String year = "2023";
    private String semester = "II";

    Scanner scanner = new Scanner(System.in);

   // a method that help us to get and set the different data of the students
    public void takeStudentInfo(){
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Welcome to the registration system.");
        System.out.println("To register for this semester enter the informations below correctly");
        System.out.println("--------------------------------------------------------------------");


        try {
            System.out.print("firstname: ");
            firstName = scanner.nextLine().toUpperCase();
            if (firstName.matches("[a-zA-Z+' ']+"))
                setFirstName(firstName);
            else 
                throw new InputMismatchException();

            System.out.print("lastname: ");
            lastName = scanner.nextLine().toUpperCase();
            if (lastName.matches("[a-zA-Z+' ']+"))
                setLastName(lastName);
            else 
                throw new InputMismatchException();
            
            System.out.print("idNo: ");
            idNo = scanner.nextLine().toUpperCase();
            setIdNo(idNo);
            

            System.out.print("gender(F/M): ");
            gender = scanner.nextLine().toUpperCase();
            if (gender.matches("[a-zA-Z+' ']+"))
                setGender(gender);
            else 
                throw new InputMismatchException();
            
            
            System.out.println("choose department...");
            System.out.println("----------------------------------");
            System.out.println("enter: 1 for Software Engineering.");
            System.out.println("enter: 2 for Computer Science.");
            System.out.println("enter: 3 for Information System.");
            System.out.println("enter: 4 for Information Technoloy.");
            System.out.println("enter: 5 for Information Science.");
            System.out.println("----------------------------------");

            System.out.print("department: ");   
            department = scanner.nextInt();
            setDepartment(department);
        } catch (InputMismatchException e) {
            System.out.println("Please enter again, the data has input type miscmatch.");
        }

    }



   // a method that help us to repost the registered information back to us
    public void reportRegistrationInformation(){
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("You have registerd successfuly!!!");
        System.out.println("--------------------------------------");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Id Number: " + idNo);
        System.out.println("Sex: " + gender);

        dep = getDepartment();
        if (dep == 1){
            setDepartmentChoice("SOFTWARE ENGINEERING.");
        }
        else if (dep == 2){
            setDepartmentChoice("COMPUTER SCIENCE.");
        }
        else if (dep == 3){
            setDepartmentChoice("INFORMATION SYSTEM.");
        }
        else if (dep == 4){
            setDepartmentChoice("INFORMATION TECHNOLOGY.");
        }
        else { 
            setDepartmentChoice("INFORMATION SCIENCE.");
        }

        System.out.println("Department: " + departmentChoice);
        System.out.println("---------------------------------------");
        System.out.println("");
        
    }

    // a fuction that help us to see the slip after we registered
    public void showSlip(){
        System.out.println("");
        System.out.println("Here is your slip.");
        if (dep == 1){
            System.out.println("------------------------------------------------------------------");
            System.out.println("ID: " + idNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("#   course title                  Cr.Hr            Instructor Name");
            System.out.println("1   Object oriented programming     3               Kebede A.");
            System.out.println("2   Fundamental Of Networking       4               Ayalew T.");
            System.out.println("3   Data Structure and Algorithm    3               Gaddisa B. ");
            System.out.println("4   Computer Organization           4               Chala D. ");
            System.out.println("5   Discrete Mathematics            2               Hailu T.  ");
            System.out.println("6   Fundamental of DataBase         4               Najib J.");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
        }

        else if (dep == 2){
            System.out.println("------------------------------------------------------------------");
            System.out.println("ID: " + idNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("#   course title                  Cr.Hr            Instructor Name");
            System.out.println("1   programming II                  3               Daniel Z.");
            System.out.println("2   Fundamental Of Networking       3               Ayalew T.");
            System.out.println("3   Applied Mathematics II          3               Tizta B. ");
            System.out.println("4   Global Trend                    3               Chala D. ");
            System.out.println("5   Discrete Mathematics            2               Belachew T.  ");
            System.out.println("6   Fundamental of DataBase         4               Mohhamed J.");
            System.out.println("-------------------------------------------------------------------");
        }

        else if (dep == 3){
            System.out.println("------------------------------------------------------------------");
            System.out.println("ID: " + idNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("#   course title                  Cr.Hr            Instructor Name");
            System.out.println("1   programming III                 5               Kebede A.");
            System.out.println("2   Fundamental Of Networking       4               Kenenisa T.");
            System.out.println("3   Data Structure and Algorithm    3               Gaddisa B. ");
            System.out.println("4   Compiler design                 4               Chala D. ");
            System.out.println("5   Discrete Mathematics II         3               Hailu T.  ");
            System.out.println("6   Software Metrics                4               Kirubel J.");
            System.out.println("-------------------------------------------------------------------");
        }


        else if (dep == 4){
            System.out.println("------------------------------------------------------------------");
            System.out.println("ID: " + idNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("#   course title                  Cr.Hr            Instructor Name");
            System.out.println("1   Object oriented programming     3               Kebede A.");
            System.out.println("2   Fundamental Of Networking       4               Hakimi T.");
            System.out.println("3   Data Structure and Algorithm    3               Gaddisa B. ");
            System.out.println("4   Fundamental of ML               4               Dagu D. ");
            System.out.println("5   Web Design                      2               Hailu T.  ");
            System.out.println("6   Fundamental of DataBase         4               Tesfahun N.");
            System.out.println("-------------------------------------------------------------------");
        }

        else{
            System.out.println("------------------------------------------------------------------");
            System.out.println("ID: " + idNo);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("#   course title                  Cr.Hr            Instructor Name");
            System.out.println("1   Advanced Database System        3               Kebede A.");
            System.out.println("2   Fundamental Of Networking       4               Diriba F.");
            System.out.println("3   Data Structure and Algorithm    3               Gaddisa B. ");
            System.out.println("4   Computer Organization           4               Chala D. ");
            System.out.println("5   Requirement Engineering         2               Hailu T.  ");
            System.out.println("6   Software Security               4               Chaltu J.");
            System.out.println("-------------------------------------------------------------------");
        }

        System.out.println("");
        
    }


 
   // getters and setters 
    public String getFirstName() {
        return firstName;
    }
    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartmentChoice() {
        return departmentChoice;
    }

    public void setDepartmentChoice(String departmentChoice) {
        this.departmentChoice = departmentChoice;
    }











}
