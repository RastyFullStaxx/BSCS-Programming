public class Person {                               // 10. Turn into a subclass of Person (Linked Classes Now: Employee -> EmpMain -> Person)

    private String strLast;    
    private String strFirst;   
    private String strMiddle;  

    public Person() {

    }  // public Person()

    public Person(String tstrLast, String tstrFirst, String tstrMiddle) {

        this.strFirst = tstrFirst;
        this.strMiddle = tstrMiddle;
        this.strLast = tstrLast;

    }  // public Person(String tstrLast, String tstrFirst, String tstrMiddle)

    public void setLast(String tstrLast) {

        this.strLast = tstrLast;

    }  // public void setLast(String tstrLast) 

    public void setFirst(String tstrFirst) {

        this.strFirst = tstrFirst;

    }  // public void setFirst(String tstrFirst) 

    public void setMiddle(String tstrMiddle) {

        this.strMiddle = tstrMiddle;

    }  // public void setMiddle(String tstrMiddle)

    
    public String getLast() {

        return this.strLast;

    }  // public String getLast()

    public String getFirst() {

        return this.strFirst;

    }  // public String getFirst()
  
    public String getMiddle() {

        return this.strMiddle;

    }  // public String getMiddle()

    
    public String getFullName() {

        return this.strFirst + " " +
               this.strMiddle + " " +
               this.strLast; 

    }  // public String getFullName()    

}  // public class Person
