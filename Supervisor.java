/**
   Supervisor class that serves as subclass to Employee class
*/
public class Supervisor extends Employee{
   
    //private instance variable to store Employee's Salary
    private double annualSalary;
    
    /**
       Argument Constructor that sets lastName, firstName and IdNumber from Employee class and sets annualSalary in Supervisor class
       @param Last The Employee's Last Name
       @param First The Employee's First Name
       @param idNumber The Employee's Id #
       @param annualSalary The annualSalary for the Employee
    */
    public Supervisor(String Last,String First,String idNumber, double annualSalary){
       super(Last,First,idNumber);
       this.annualSalary =annualSalary;
    }
    
    /**
       No Argument constructor that sets firstName,LastName,idNumber from Employee and anuualSalary from supervisor to a default value
    */
    public Supervisor(){
       super("Diane", "Jefferson","81fj3190a");
       annualSalary = 190_000;
    }
    
    /**
       Method to set the annualSalary of an Employee
       @param annualSalary The annualSalary of the Employee
    */
    public void setAnnualSalary(double annualSalary){
       this.annualSalary = annualSalary;
    }
    
    
    /**
       Returns the annualSalary of the Employee
       @return The annualSalary of the Employee
    */
    public double getAnnualSalary(){
       return annualSalary;
    }
    
    /**
       Overrides the increasePay method in Employee to increase the Employee's pay by a percentage
       @param percentage The number that serves as a percentage to the Employee's pay raise
       @return The Employee's Salary after being increase by percentage
    */
    @Override
    public double increasePay(double percentage){
       annualSalary = annualSalary*(1+(percentage/100));
       return annualSalary;
    }
    
    /**
       Overrides the decreasePay method in Employee to decrease the Employee's pay by a percentage
       @param percentage The number that serves as a percentage to the Employee's pay decrease
       @return The Employee's Salary after being decreased by percentage
    */
    @Override
    public double decreasePay(double percentage){
       annualSalary = annualSalary * (1-(percentage/100));
       return annualSalary;
    }
    
    
    /**
       Overrides the getMonthlyPay method in Employee to return the Employee's current Salary
       @return The Employee's Salary 
    */
    @Override
    public double getMonthlyPay(){
       return (annualSalary*1.02)/12;
    }
    
    /**
       Overrides the toString method in Employee to include the additional instance variable information
       @return The Employee's information including first name,last name, id # and their Salary
    */
    @Override
    public String toString(){
       return super.toString() + "AnnualSalary:\t  $"+annualSalary;
    }
 }
