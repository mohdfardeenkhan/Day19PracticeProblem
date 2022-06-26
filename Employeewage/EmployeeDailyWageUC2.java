public class EmployeeDailyWageUC2 {
    public static void main(String[]args) {
        //auto-generated method

        int isFullTime=1;
        int EmpHrs=0;
        int EmpWage=0;
        int EmpRatePerHr=20;

        double EmpCheck = Math.floor(Math.random()*10)%2;
        if (EmpCheck==isFullTime);
        {
            EmpHrs=8;
        }
        EmpWage = EmpHrs * EmpRatePerHr;
        System.out.println(" EmpWage "+EmpWage);

    }
}