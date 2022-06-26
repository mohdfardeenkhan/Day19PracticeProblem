public class SwitchUC4 {
    public static final int isFullTime=1;
    public static final int isEmpRatPerHr=1;
    public static final int isPartTime=2;

    public static void main(String [] args) {

        int EmpHrs=0;
        int EmpWage=0;



        double EmpCheck = Math.floor(Math.random()*10)%3;
        switch ((int)EmpCheck){

            case
                    isFullTime:
                EmpHrs=8;
                break;

            case
                    isPartTime:
                EmpHrs=4;
                break;
            default:
                EmpHrs=0;
        }
        EmpWage = EmpHrs* isEmpRatPerHr;
        System.out.println("Emp Wage"+ EmpWage);
    }
}