public class PersonMain extends EmpMain{                            // 15. Turn into a subclass of EmpMain (Linked Classes Now: Employee -> Person -> EmpMain -> PersonMain)

    public static void main(String[] args) {

        // 16. Instantiate the Person and EmpMain object
        Person objPerson1 = new Person();
        EmpMain person1 = new EmpMain();

        // 17. Use the Person Class [to Assign First, Middle and last name]
        objPerson1.setFirst("Rasty");
        objPerson1.setMiddle("Cannu");
        objPerson1.setLast("Espartero");       

        // 18. Print the Full Name for objPerson1
        System.out.println("Fullname of objPerson1 is " +
                           objPerson1.getLast() + ", " +
                           objPerson1.getFirst() + " " +
                           objPerson1.getMiddle());

        // 19. Print the EmpId declared in the EmpMain for objPerson1
        System.out.println(person1.getstrEMPID());
        System.out.println("\n");

        // 20. Print the Full Name for objPerson1
        Person objPerson2 = new Person();
        objPerson2.setFirst("Dhavid");
        objPerson2.setMiddle("Grizzler");
        objPerson2.setLast("Mahayag");
        System.out.println("objPerson2 name: " + 
                           objPerson2.getFullName());
        
        // 21. Print the EmpId declared in the EmpMain for objPerson2
        System.out.println(person2.getstrEMPID());
        System.out.println("\n");

        // 22. Print the Full Name for objPerson1
        Person objPerson3 = new Person("Jose Rizal", "Aguinaldo", "Emilio");
        System.out.println("Fullname of objPerson3 is " +
                           objPerson3.getFullName());

        // 23. Print the EmpId declared in the EmpMain for objPerson3
        System.out.println(person3.getstrEMPID());
        System.out.println("\n");



    }  

}  
