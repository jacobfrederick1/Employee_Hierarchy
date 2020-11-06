/**
   Abstract Employee Class serves as superClass
*/
public abstract class Employee{

    //private instance variables that hold first & last Name with Employee's id #
    private String firstName;
    private String lastName;
    private String idNumber;
    
    /**
       argument constructor for Employee that set firstName,LastName and idNumber
       @param first First Name of the Employee
       @param last Last Name of the Employee
       @param id Employee's id #
    */
    public Employee(String first,String last,String id){
       firstName = first;
       lastName = last;
       idNumber = id;
    }
    
    /**
       no argument constructor for Employee that sets firstName,LastName and idNumber
    */
    public Employee(){
       firstName = "Jacob";
       lastName = "Frederick";
       idNumber = "30120990ad";
    }
    
    /**
       setter method for firstName
       @param name Serves as the arguument to fill variable firstName
    */
    public void setFirstName(String name){
       firstName = name;
    }
    
    /**
       setter method for lastName
       @param name Serves as the arguument to fill variable lastName
    */
    public void setLastName(String name){
       lastName = name;
    }
    
     /**
       setter method for id #
       @param idNumber Serves as the arguument to fill variable idNumber
    */
    public void setIdNumber(String idNumber){
       idNumber = this.idNumber;
    }
    
    /**
       returns the first and lastName of the employee
       @return Name Employees firstName and lastName
    */
    public String getName(){
       String name = String.format("FirstName: %-6s"+ firstName +"\nLastName: %-7s" +lastName," "," ");
       return name;
    }
    
    /**
       Method to return the employee's id #
       @return idNumber Employee's idNumber
    */
    public String getIdNumber(){
       return String.format("IdNumber: %-7s" + idNumber," ");
    }
    
    /**
       abastract methods that will be overriden by subclasses to increase an Employee's pay
       @param percentage The number as a percentage of the Employees pay increase
       @return The Employee's new pay after being increased by percentage
    */
    public abstract double increasePay(double percentage);
    
    /**
       abastract methods that will be overriden by subclasses to decrease an Employee's pay
       @param percentage The number as a percentage of the Employees pay decrease
       @return the Employee's pay affter being decreased by percentage
    */
    public abstract double decreasePay(double percentage);
    
    /**
       abastract methods to be overriden and used by subclasses to return Employee's monthly pay
       @return the Employees pay for the month
    */
    public abstract double getMonthlyPay();
    
    /**
       toString method to return information stored in instance variables
       @return percentage serves as the number that will change the employees pay
    */
    public String toString(){
       return getName() +"\n"+ getIdNumber()+"\n";
    }
    
    
 }