public class EmpWageBuilder{
public static void main(String args[]){
System.out.println("Welcome to Employee Wage Builder");
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int empWage=0;
int empWagePerHour=20;
int empHours=0;
double empCheck = Math.floor(Math.random()*10)%3;
if (empCheck == IS_FULL_TIME){
System.out.println("Employee is present");
empHours=8;
}
else if (empCheck == IS_PART_TIME){
System.out.println("Employee is Half Time");
empHours=4;
}
else{
System.out.println("Employee is absent");
empHours=0;
}
empWage=empWagePerHour*empHours;
System.out.println("Wage of a day is: "+ empWage);
}
}
