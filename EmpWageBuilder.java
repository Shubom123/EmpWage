public class EmpWageBuilder{
public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;
public static final int empWagePerHour=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static final int MAX_HOURS_IN_MONTH=100;

public static void EmployeeWage(String company, int empWagePerHour)
{
int empWage=0;
int empHours=0;
int totalEmpHours=0;
int totalWorkDays=0;
int totalEmpWage=0;
System.out.println("Welcome to Employee Wage Builder");

while (totalEmpHours<=MAX_HOURS_IN_MONTH && totalWorkDays<NUM_OF_WORKING_DAYS)
{
totalWorkDays++;
int empCheck = (int) Math.floor(Math.random()*10)%3;
switch (empCheck)
{
case IS_FULL_TIME:
System.out.println("Employee is present");
empHours=8;
break;
case IS_PART_TIME:
System.out.println("Employee is Half Time");
empHours=4;
break;
default:
System.out.println("Employee is absent");
empHours=0;
}
totalEmpHours = totalEmpHours + empHours;
empWage = empWagePerHour * empHours;
System.out.println("Daily Wage of a worker at "+ company + "is" + empWage + " in " + empHours);
}
totalEmpWage = totalEmpHours * empWagePerHour;
System.out.println("Monthly wage of a worker at "+ company + " is " + totalEmpWage + " in " + totalEmpHours);

}

public static void main(String args[])
{
 EmployeeWage("Nokia", 40);
 EmployeeWage("Bridgelabzs", 35);
 EmployeeWage("GTA", 45);

}
}