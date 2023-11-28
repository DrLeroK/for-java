package student_registration;

import java.util.ArrayList;

public class Admin extends studentInformation{
    studentInformation studentinformation;
    static ArrayList singleStudentData = new ArrayList<>();

    public Admin(studentInformation studentinformation){
        this.studentinformation = studentinformation;
    }

    public void admin(){ 
        singleStudentData.add("--------------------");

        singleStudentData.add("First name: " + studentinformation.getFirstName());
        singleStudentData.add("Last name: " + studentinformation.getLastName());
        singleStudentData.add("Gender: " + studentinformation.getGender());
        singleStudentData.add("Department: " + studentinformation.getDepartmentChoice());

        singleStudentData.add("--------------------");
        }

    public static void printData(){
        System.out.println("");
        System.out.println("Here is the list of students that have registered.");
        for(var x: singleStudentData){
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("");

    }
}
