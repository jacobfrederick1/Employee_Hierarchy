/**
   HourlyWorker class that serves as a subclass to Employee
*/
public class HourlyWorker extends Employee{
   
    //instance variables
    private int hoursWorked;
    private double payRate;
    
    /**
       Argument constructor that sets the lastName,firstName,idNumber from Employee and the Employees pay from HourlyWorker
       @param Last The last name of the Employee
       @param First The first name of the Employee
       @param idNumber The id # of the Employee
       @param payRate The Employees hourly pay rate
    */
    public HourlyWorker(String Last, String First, String idNumber,double payRate){
       super(Last,First,idNumber);
       this.payRate = payRate;
    } 
    
    
    /**
       No argument constructor that sets lastName,firstName and idNumber from employee and payRate from HourlyWorker to a default value
    */
    public HourlyWorker(){
       super("Madison","Shepherd","80192ldi");
       payRate = 25.50;
    }
    
    /**
       Sets the Employee's HourlyRate
       @param hourlyRate The Employee's hourlyRate
    */
    public void setHourlyRate(double hourlyRate){
       payRate = hourlyRate;
    }
    
    /**
       Sets the hours the Employee has worked
       @param Hours The number of hours that the Employee has worked
    */
    public void setHours(int hours){
       hoursWorked = hours;
    }
    
    /**
       Returns the number of hours the Employee has worked
       @return The number of hours the Employee has worked
    */
    public int getHours(){
       return hoursWorked;
    }
    
    /**
       Returns the Employees Hourly pay
       @return The Employee's hourly pay rate
    */
    public double getHourlyRate(){
       return payRate;
    }
      
   /**
       Overrides the increasePay method in Employee to increase the Employee's pay by a percentage
       @param percentage The number that serves as a percentage to the Employee's pay increase
       @return The Employee's Salary after being increased by percentage
   */
    @Override
    public double increasePay(double percentage){
       payRate = payRate * (1+(percentage/100));
       return payRate;
    }
    
    /**
       Overrides the decreasePay method in Employee to decrease the Employee's pay by a percentage
       @param percentage The number that serves as a percentage to the Employee's pay decrease
       @return The Employee's Salary after being decreased by percentage
    */
    @Override
    public double decreasePay(double percentage){
       payRate = payRate *(1-(percentage/100));
       return payRate;
    }
    
    /**
       Overrides the getMonthlyPay method in Employee to return the Employee's monthly pay
       @return The Employee's Monthly pay
    */
    @Override
    public double getMonthlyPay(){
       double pay = 0;
       if(hoursWorked>=160){
          int overTimeHours = hoursWorked - 160;
          pay+= overTimeHours*(payRate*1.5);
          pay+= ((hoursWorked - overTimeHours)*payRate);
       }
       else{
          pay+= hoursWorked*payRate;
       }
       
       return pay;
    }
    
    //overrides toString in employee
    @Override
    public String toString(){
       return super.toString() + "Hourly Pay Rate: $ " + payRate;
    }
    
 }