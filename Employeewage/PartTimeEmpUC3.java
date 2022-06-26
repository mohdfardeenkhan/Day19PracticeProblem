public class PartTimeEmpUC3 {
    public static  void main(String[] args) {

        int isFullTime=1;
        int isPartTime=2;
        int EmpHrs=0;
        int EmpWage=0;
        int EmpWagePerHr=20;

        double EmpCheck = Math.floor(Math.random()* 10)%3;

        if (EmpCheck==isFullTime)
        {
            EmpHrs=8;
        }

        else if (EmpCheck == isPartTime)
        {
            EmpHrs=4;
        }
        EmpWage = EmpHrs * EmpWagePerHr;
        System.out.println("Emp Wage" +EmpWage);
    }

}