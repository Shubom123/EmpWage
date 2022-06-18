public class EmpWageBuilder{
public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;
public static final int empWagePerHour=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static void main(String args[]){
System.out.println("Welcome to Employee Wage Builder");
int empWage=0;
int empHours=0;
int totalEmpWage=0;
for(int days=0; days<=NUM_OF_WORKING_DAYS; days++){
int empCheck = (int) Math.floor(Math.random()*10)%3;
switch (empCheck){
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
empWage=empWagePerHour*empHours;
totalEmpWage=totalEmpWage+empWage;
System.out.println("Wage of a day is: "+ empWage);
}
System.out.println("Wage of whole month is: "+ totalEmpWage);
}
}
