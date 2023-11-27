/*  Name: Rasty Cannu Esparterp
 *  Section: BSCS 2-4
 *  Subject: COMP 005: Data Structures and Algorithms
 *  TOPIC: Linked List
 *  Submitted: 11/28/2023                            */

class Main {
    public static void main(String[] args) {
        
        // [1] Create the 1st node objec and assign value to it
        Nodes head1 = new Nodes(5);
        // [2] Create and link two more nodes from head1 (using next) and assign value to it
        head1.next = new Nodes(3);
        head1.next.next = new Nodes(1);
        head1.next.next.next = new Nodes(3);
        head1.next.next.next.next = new Nodes(4);

        // [3] Create the 2nd node objec and assign value to it
        Nodes head2 = new Nodes(2);
        // [4] Create and link two more nodes from head2 (using next) and assign value to it
        head2.next = new Nodes(7);
        head2.next.next = new Nodes(1);

        // [5] Pass the data from the head1 and head2 then call the Method (addInteger) to return the processed values
        //                  --- Look Outside the Funnction! ---
        // [8] Initialize the result with the sum of integers produced from calling the addInteger method
        Nodes result = addInteger(head1, head2); 

        // [9] Display the outcomes using while loop
        lineBreak();
        System.out.println("OUTCOME:\n");
        while (result != null) {  // [9.1] Checks and display existing nodes
            System.out.print(result.data + "   "); // [9.2] Print the current data from this iteration
            result = result.next;  // [9.3] Reassign result to move to the next node
        }  
        System.out.println(); 
        lineBreak();
        System.out.println("OPERATION DONE:\n");
        System.out.println("\t  4  3  1  3  5\n\t+       1  7  2\t\n\t------------------\n\t  4  3  3  0  7\n");
        lineBreak();
        System.out.println();
    }

        // [5.1] Method to add integers from two linked lists
        static Nodes addInteger(Nodes head1, Nodes head2) {

            // [5.2] Initialize a placeholder holder linked-list then;
            Nodes head3 = new Nodes(0);

                // [5.3] Initialize head3 as the current head for our starting point in the adding operation
                Nodes current = head3;

            // [5.4] Initialize and assign pointers to each head 
            Nodes head1Pointer = head1;
            Nodes head2Pointer = head2;

            // [5.5] Initialize an integer carry variable just in case the sum of the current nodes exceeds 9
            int carry = 0;

            // [5.6] Deploy the while loop to iterate over the two-linked lists' values as we perform the addition
            while(head1Pointer != null || head2Pointer != null) {

                // [5.7] Declare two variables to check and initialized to itself the data stored from where the nodes-pointers are referring to
                int head1Data = (head1Pointer != null) ? head1Pointer.data : 0;  // if there's a node, that node's value will be extracted; and if there are none, 0 is assigned instead
                int head2Data = (head2Pointer != null) ? head2Pointer.data : 0;  // if there's a node, that node's value will be extracted; and if there are none, 0 is assigned instead

                // [5.8] Add the two current digits extracted from the corresponding nodes PLUS the carry from the previous iteration
                int sum = head1Data + head2Data + carry; 

                    // [5.9] Check and update the carry if there is, then store it
                    carry = sum / 10;   // Formula to get that remainder 1 (the carry)

                    // [5.10] Move to the next nodes to add, by extending (using next) the initial placeholder AND then add the remainder 1 to it before proceeding
                    current.next = new Nodes(sum % 10);

                // [5.11] Set the extended placeholder node as the current
                current = current.next;  

                // [5.12] Check and reassign the pointers to the next node IF there are nodes
                if (head1Pointer != null) head1Pointer = head1Pointer.next;
                if (head2Pointer != null) head2Pointer = head2Pointer.next;
            }

            // [6] Check if there's still an integer remaining in the carry from the previous loop 
            if (carry > 0) {  // if there is, another node will be extended from the current to store it
                current.next = new Nodes(carry);
            }

            // [7] Return the next node of the placeholder head3, which is the head of the result
            return head3.next;

            //                             --- Look Back Inside the Main --- 
        }
            // [-- Just for Design --]
            static void lineBreak() {
                System.out.println("=================================");
            }

}       
