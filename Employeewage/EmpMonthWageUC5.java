public class EmpMonthWageUC5 {
    public static void main(String[] args) {

        int isFullTime=1;
        int isPartTime=2;
        int EmpHrs=0;
        int EmpWage=0;
        int EmpRatPerHr=20;
        int TotalDayWage=20;

        double EmpCheck= Math.floor(Math.random()*10)%2;
        if(EmpCheck == isFullTime)
        {
            EmpHrs=8;
        }
        else if (EmpCheck == isPartTime)
        {
            EmpHrs=4;
        }
        EmpWage = EmpHrs * EmpRatPerHr *TotalDayWage;
        System.out.println("TotalDay Wage" +EmpWage);
    }
}