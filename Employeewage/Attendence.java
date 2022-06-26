public class Attendence {

    public static void main(String[] args) {
        //Todo Auto-generated method

        int isFullTime=1;
        double Empcheck= Math.floor(Math.random() *10)%2;

        if(Empcheck==isFullTime) {
            System.out.println("Employee is Present");

        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}