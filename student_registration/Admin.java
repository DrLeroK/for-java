package student_registration;

import java.util.ArrayList;

// this class inherrits from the studentInformation class and helps us to store the datas
public class Admin extends studentInformation{
    studentInformation studentinformation;
    static ArrayList singleStudentData = new ArrayList<>();

    public Admin(studentInformation studentinformation){
        this.studentinformation = studentinformation;
    }

    // this helps us to store the data into in array for later retrival
    public void admin(){ 
        singleStudentData.add("--------------------");

        singleStudentData.add("First name: " + studentinformation.getFirstName());
        singleStudentData.add("Last name: " + studentinformation.getLastName());
        singleStudentData.add("Gender: " + studentinformation.getGender());
        singleStudentData.add("Department: " + studentinformation.getDepartmentChoice());

        singleStudentData.add("--------------------");
        }

    // helps us to see the students that hava registered successfully
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
