/*  Name: Rasty Cannu Esparterp
 *  Section: BSCS 2-4
 *  Subject: COMP 005: Data Structures and Algorithms
 *  Activity: Stacks 1/2
 *  Submitted: 11/29/2023                            */

import java.util.Stack;

//  Stacks = Follows LIFO i.e., last in, first out
//           stores objects like an array but in a vertical perspective
//           push() = add an element to the top
//           pop() = removes the element from the top
//           peek() = check the current value on top of the stack

public class activity5StacksNo1 {
    public static void main(String[] args) {

        // [1] Create a stack to store a integer objects
        // Syntax: Stack<dataType> stackName = new Stack<dataType>;
        Stack<Integer> s = new Stack<>();   // Since I'll be applying string methods, I'll use the wrapper class of int (e.i., Integer)

        // [2] Initialize 2 variables I'll be pushing into the stack
        int x = 5; 
        int y = 3;

        // [3] Push x and y variables into the stack [ using: push(variablename) ]
        s.push(x);  // [3.1] Pushed variable x

        /*  Stack s' Current Visual:
         *                        -----
         *               x    =   | 5 |
         *                        -----       */
         // size = 1

        s.push(2 * y);  // [3.2] Pushed variable y, with its value multiplied to 2
        /*  Stack s' Current Visual:
         *                        -----
         *        (2 x y=3)   =   | 6 |
         *                        -----
         *               x    =   | 5 |
         *                        -----       */
         // size = 2

        s.push(4);  // [3.3] Pushed an integer directly whose value is 4
        /*  Stack s' Current Visual:
         *                        -----
         *  inserted value    =   | 4 |
         *                        -----
         *        (2 x y=3)   =   | 6 |
         *                        -----
         *               x    =   | 5 |
         *                        -----       */
         // size = 3
          
        // [4] Popped the last inserted value from the stack (i.e., 4) assigned it to y
        y = s.pop();    // [4.1] y is now equals to 4 (NOTE!: The variable y [y] declared at the top, not the variable y already inserted in the stack [s.push(2*y)] )

        /*  [4.2] Stack s' Current Visual:
         *
         *         y = 4 
         *                        -----
         *        (2 x y=3)   =   | 6 |
         *                        -----
         *               x    =   | 5 |
         *                        -----       */
         // size = 2

        // [5] Pushed another value onto the stack
        s.push(7);  

        /*  [5.1] Stack s' Current Visual:
         *                        -----
         *  inserted value    =   | 7 |
         *                        -----
         *       (2 x y=3)    =   | 6 |
         *                        -----
         *               x    =   | 5 |
         *                        -----       */
         // size = 3

        // [6] Popped a value from the stack (removes the top element)
        s.pop();

        /*  [6.1] Stack s' Current Visual:
         *                        -----
         *       (2 x y=3)    =   | 6 |
         *                        -----
         *       s.push(x)    =   | 5 |
         *                        -----       */
        // size = 2

        // [7] Peek and accessed the value at the top of the stack then assigned it to x
        x = s.peek();   // [7.1] x' value is now 6 (NOTE!: The variable x [x] declared at the top, not the variable x already inserted in the stack [s.push(x)] )

        // [7.2] Print to check
        lineBreak();
        System.out.println("The top value at this point in the stack now is " + s.peek());
        System.out.println("    Therefore 'x' will now have the value of " + s.peek());
        lineBreak();
        /*  [6.1] Stack s' Current Visual:
         *        x = 6
         *                        -----
         *       (2 x y=3)    =   | 6 |
         *                        -----
         *       s.push(x)    =   | 5 |
         *                        -----       */
         // size = 2

        // [7] Initialized the size of the stack to variable n
        int n = s.size();   // [7.1] n's value is now 2

        // [8] Push values onto the stack based on its size
        for (int i = 0; i < n; i++) {   // [8.1] the value of n (i.e., 2) will by pushed twice
            s.push(n);
        }

        /*  [8.2] Stack s' Current Visual:
         *                        -----
         *            loop 2  =   | 2 |
         *                        -----
         *            loop 1  =   | 2 |                      
         *                        -----
         *       (2 x y=3)    =   | 6 |
         *                        -----
         *       s.push(x)    =   | 5 |
         *                        -----       */
         // size = 4       

        // [9] Pop and print each value from the stack
        System.out.println("\tPrinting the values from Stack s\n");
        while (!s.isEmpty()) {  // [9.1] As long as the a value is found inside a stack space
            y = s.pop();    // [9.2] A value on top would be removed--assigned to y, and then be;       
            System.out.println("\t\t\t" + y);  // [9.3] Printed: 2, 2, 6, 5 respectively
        } System.out.println();

        // [10] Print the final value of x
        lineBreak();
        System.out.println("Final value of x \t=\t " + x);
        System.out.println("Final value of y \t=\t " + y);
        lineBreak();
        System.out.println();
    }
        // [-- Just for Design --]
        static void lineBreak() {
            System.out.println("=================================================");
        }
}
