package mystuff;

public class Driver {
    public static void main(String [] args) {
        MyStuff mySchedule = new MyStuff();
        mySchedule.firstClass = "Math 3A";
        mySchedule.firstTime = "8am";
        mySchedule.secondClass = "CIT 15";
        mySchedule.secondTime = "11am";
        mySchedule.thirdClass = "CIT 28";
        mySchedule.thirdTime = "1pm";
        mySchedule.fourthClass = "CIT 63";
        mySchedule.fourthTime = "3pm";

        System.out.println(mySchedule.firstClass);
        System.out.println(mySchedule.firstTime);
        System.out.println(mySchedule.secondClass);
        System.out.println(mySchedule.secondTime);
        System.out.println(mySchedule.thirdClass);
        System.out.println(mySchedule.thirdTime);
        System.out.println(mySchedule.fourthClass);
        System.out.println(mySchedule.fourthTime);
    }
}
