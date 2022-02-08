package practice;

public class EmployeeWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int dailyFullHour = 8;
        boolean isPresent = true;
        boolean isAbsent = false;
        if (Math.floor(Math.random() * 2) == 1){
            int employeeDailyWage = (wagePerHour * dailyFullHour);
            System.out.println("Employee daily wage is : " + employeeDailyWage);

        }
    }
}
