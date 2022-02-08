package Assignment2;

public class employee {
    private String employeename;
    private int hours;
    private double rate, pay;

    public void setEmployeename ( String name )
    {
        employeename =name;
    }
    public String getEmployeename()
    {
        return employeename;
    }
    public double calculatePay( int hours, double rate )
    {
        if ( hours > 40 )
        {
            int extrahours = hours - 40;
            pay = (40 * rate) + (extrahours * rate);
        }
        else pay = hours * rate;
        return pay;
    }
    public void displayemployee()
    {
        System.out.printf("Employee name: %s", getEmployeename() );
        System.out.printf("\nGross Salary: ", + pay );
    }
}




