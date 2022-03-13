package day4;

 public class InstanceVariables {

   // Here name is the instance variable
   public String name;
   public double salary;

   // The name variable is assigned in the constructor.
   public InstanceVariables (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }
   
//Instance variables can be accessed directly by calling the variable name inside the class.
// However, within static methods they should be called using the "ObjectReference.VariableName"

   public static void main(String args[]) {
	  InstanceVariables empOne = new InstanceVariables("Saniya");
      empOne.setSalary(100000);
      empOne.printEmp();
   }
}