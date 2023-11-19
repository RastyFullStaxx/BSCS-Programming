public class Employee extends Person{                                  // 1. Turn into a subclass of Person (Linked Classes Now: Employee -> Person)
    
    // 2. Declare the private attribtues
    private String strEmpID;                                            
    private double dbEmpSalary;

    // 3. Create the constructor for attributes (reusable variables)
    Employee(String strEmpID, double dbEmpSalary) {                     // 4. Pass on the attributes to the constructor
        this.SetstrEMPID(strEmpID);                                     // 9. Assign new values to the strEmpId, done the main class
        this.SetdbEmpSalary(dbEmpSalary);                               // 10. Assign new values to the strEmpId, done the main class
    }


    // 5. Create the Getter for strEMPID
    public String getstrEMPID(){
        return strEmpID;
    }
    // 6. Create Getter for dbEmpSalary
    public double getdbEmpSalary(){
        return dbEmpSalary;
    }


    // 7. Create Setter for strEMPID
    public void SetstrEMPID(String strEmpID) {
        this.strEmpID = strEmpID;
    }
    // 8. Create Setter for dbEmpSalary
    public void SetdbEmpSalary(double dbEmpSalary) {
        this.dbEmpSalary = dbEmpSalary;
    }


}