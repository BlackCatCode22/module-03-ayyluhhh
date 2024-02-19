package mystudent;

public class App
{ // create an object, which allows to insert information, like so this is the information to create a student
    public static void main(String[] args)
    { // this has the values
        Student myStudent = new Student();
        myStudent.firstName = "Ayla";
        myStudent.lastName = "Nava";
        myStudent.major = "Computer Informations";
        myStudent.gpa = 2.8;
        myStudent.age = 23;
        myStudent.onProbation = false;

        System.out.println(myStudent.firstName); //this allows you to print the information
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.major);
        System.out.println(myStudent.gpa);
        System.out.println(myStudent.age);
        System.out.println(myStudent.onProbation);

    }
}
