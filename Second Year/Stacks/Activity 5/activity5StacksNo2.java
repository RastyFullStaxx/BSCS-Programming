/*  Name: Rasty Cannu Esparterp
 *  Section: BSCS 2-4
 *  Subject: COMP 005: Data Structures and Algorithms
 *  Activity: Stacks 2/2
 *  Submitted: 11/29/2023                            */

import java.util.Stack;

public class activity5StacksNo2 {
    public static void main(String[] args) {

        // [1] Create a stack to store a integer objects
        Stack<Integer> R = new Stack<>();   // [1.1] Create an object stack R
        Stack<Integer> S = new Stack<>();   // [1.2] Create an object stack S
        Stack<Integer> T = new Stack<>();   // [1.3] Create an object stack T

        // [2] Used for loop to assign values to stack S
        for (int i=10; i<50; i+=10) {
            S.push(i);
            T = S;  // [2.1] Stack T and S was made to refer an identical stacl
                    // Therefore, any changes that stack S would incur, would also affect Stack T. Vice versa 
        }

        /*  Stack S/T' Current Visual:
         *                        -----
         *        4th loop    =   | 40 |
         *                        -----      
         *        3rd loop    =   | 30 |
         *                        -----
         *        2nd loop    =   | 20 |
         *                        -----  
         *        1st loop    =   | 10 |
         *                        -----         */
         // size = 4
         
        // [3] Declared a and b variables
        int a, b;

        // [4] Used while loop to pop all the values from stack S, ang assigned it to stack R
        while (!S.isEmpty()) {
            a = S.pop();    // [4.1] Pop, remove the top most value from stack S and assign it to a
            R.push(a);      // [4.2] The variable a, pushed the popped value to stack R 
        }   

        /*  Stack R' Current Visual:
         *                        -----
         *        4th loop    =   | 10 |
         *                        -----       
         *        3rd loop    =   | 20 |
         *                        -----
         *        2nd loop    =   | 30 |
         *                        -----  
         *        1st loop    =   | 40 |
         *                        -----         */
         // size = 4  

        // [5] Initialized variable 'n' with the value of 0, from T stack's size
        int n = T.size(); /*  NOTE!: Since T and S are equalled to be the one stack of the same identity;
                           * and that S already transferred all its value to R;
                           * it's size is 0; the same way sa t. Therefore, n = 0 here; */
    
        // [6] This line hoped to transfer the values of R and T, but T is already empty since stack S as was made empty 
        for (int i = 0; i < n; i++) {   // [6.1] On top of that, n is set to 0 making this loop useless
            a = R.pop();
            b = T.pop();
            System.out.println("R = " + a + " T = " + b);   // [6.2] a and b is null since the loop didn't function in the first place
        }

        System.out.println(" R T");
        System.out.println("a and b along with n is set to null since the loop didn't function in the first place");

    }
}

/* 
 * To correct this code, and actually print the expected outputs:
 *      
 *                      R = 10 T = 40
 *                      R = 20 T = 30
 *                      R = 30 T = 20
 *                      R = 40 T = 10
 *      
 * Solution: Create stack T as a separate entity from stack S 
 *           by modifying the statement "T = S" found in line 20 with
 *           'T.push(i)'                                                */
