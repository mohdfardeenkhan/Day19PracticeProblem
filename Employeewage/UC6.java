public class UC6 {
    public static void main(String[] args) {

        int isFullTime=1;
        int isPartTime=2;
        int EMHrs=0;
        int EMWage=0;
        int EMRatPrHrs=20;
        int TotalDayWage=20;
        int TotalHrs=100;

        double EmpCheck = Math.floor(Math.random()*10)%2;

        if (EmpCheck == isFullTime)
        {
            EMHrs=8;

        }
        else if (EmpCheck == isPartTime)
        {
            EMHrs=4;
        }

        EMWage = EMHrs*EMRatPrHrs*TotalDayWage*TotalHrs;
        System.out.println("Total Working Hours in Month "+EMWage);

    }


}