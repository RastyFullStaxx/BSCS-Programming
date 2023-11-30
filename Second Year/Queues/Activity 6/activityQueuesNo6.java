import java.util.Queue;             // [0] Import the queues library
import java.util.LinkedList;        // [0] Import the LinkedList library prior to the activity requirements

public class activityQueuesNo6 {
    public static void main(String[] args) {

    // =================================================================== Number 1 =================================================================== //
    
    lineBreak();
    System.out.println("\t\t   **NUMBER 1**\n");

    // [1] Instantiate the queue interface using the LinkedList object
    Queue<Character> Q = new LinkedList<Character>();
        System.out.println("Queue<Character> Q(5)  =  Front: null | Back: null");
    /*  Current status of Q:
     *      front/back
     *       -------
     *      | null |---> null
     *      -------
     *  Front: null | Back: null
     */

    // [2] Offer char 'A' to the queue
    Q.offer('A');
        System.out.println("Q.offer('A') \t       =  Front:  A   | Back:  A");
    /*  Current status of Q:
     *     front/back        
     *       ----              
     *      | A |---> null
     *      ----               
     *  Front: A | Back: A
     */
     
    // [3] Offer char 'B' to the queue
    Q.offer('B');
        System.out.println("Q.offer('B') \t       =  Front:  A   | Back:  B");
    /*  Current status of Q:
     *         front       back        
     *         ----        ----
     *        | A |  ---> | B | ---> null
     *        ----        ----             
     *  Front: A | Back: B
     */

    // [4] Offer char 'C' to the queue
    Q.offer('C'); 
        System.out.println("Q.offer('C') \t       =  Front:  A   | Back:  C");
    /*  Current status of Q:
     *         front                  back        
     *         ----        ----       ----
     *        | A |  ---> | B | ---> | C |---> null
     *        ----        ----       ---- 
     *  Front: A | Back: C
     */
    
    // [5] Dequeue queue Q and assigned the removed element to char c
    char c = Q.poll();
        System.out.println("char c = Q.poll('B')   =  Front:  B   | Back:  C");
    /*  Current status of Q:
     *         char c      front       back        
     *         ----        ----       ----
     *        | A |       | B | ---> | C |---> null
     *        ----        ----       ---- 
     *  Front: B | Back: C
     */
    
    // [6] Reoffer char 'A' to queue Q
    Q.offer('A');
        System.out.println("Q.offer('A') \t       =  Front:  B   | Back:  A\n");
    /*  Current status of Q:
     *         char c      front                 back        
     *         ----        ----       ----      ----
     *        | A |       | B | ---> | C |---> | A |---> null
     *        ----        ----       ----      ----
     *  Front: B | Back: C
     */ System.out.println("\t\tData at char c = " + c + "\n");

    // =================================================================== Number 2 =================================================================== // 

    lineBreak();
    System.out.println("\t\t   **NUMBER 2**\n");

    // [0] Instructions
    System.out.println("Direction: [*] = Dequeue | [char] = Enqueue \nProblem:   EAS*Y*QUE***ST***IO*N***\n");    

    // [1] Instantiate the queue interface using the LinkedList object
    Queue<Character> easyQuestion = new LinkedList<Character>();
    
    // [2] Offer E, A, S = {E,A,S}
    easyQuestion.offer('E');
    easyQuestion.offer('A');
    easyQuestion.offer('S');
    
    // [3] Dequeue = {A,S}
    easyQuestion.poll();

    // [4] Offer char 'Y' to the queue = {A,S,Y}
    easyQuestion.offer('Y');

    // [5] Dequeue x 1 = {S,Y}
    easyQuestion.poll();

    // [6] Offer Q, U, E = {S,Y,Q,U,E}
    easyQuestion.offer('Q');
    easyQuestion.offer('U');
    easyQuestion.offer('E');    

    // [7] Dequeue x 3 = {U,E}
    easyQuestion.poll();
    easyQuestion.poll();
    easyQuestion.poll();

    // [8] Offer S, T = {U,E,S,T}
    easyQuestion.offer('S');
    easyQuestion.offer('T');

    // [9] Dequeue x 3 = {T}
    easyQuestion.poll();
    easyQuestion.poll();
    easyQuestion.poll();

    // [10] Offer I, O = {T,I,O}
    easyQuestion.offer('I');
    easyQuestion.offer('O');

    // [11] Dequeue x 1 = {I,O}
    easyQuestion.poll();

    // [12] Offer 'N' = {I,O,N}
    easyQuestion.offer('N');

    // [13] Dequeue x 3 = {null}
    easyQuestion.poll();
    easyQuestion.poll();
    easyQuestion.poll();

    // [14] Print the final sequence 
    System.out.print("     ");
    System.out.print(easyQuestion);
    System.out.print(" = All Elements were polled out by the end\n\n");

    // =================================================================== Number 3 =================================================================== // 
    
    lineBreak();
    System.out.println("\t\t   **NUMBER 3**");

    // Instantiate the queue interfaces using the LinkedList object
    Queue<Integer> interMixedSequenceA = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceB = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceC = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceD = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceBdeq = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceCdeq = new LinkedList<Integer>();
    Queue<Integer> interMixedSequenceDdeq = new LinkedList<Integer>();

    // [A] Offer integers to the queue
    interMixedSequenceA.offer(0);
    interMixedSequenceA.offer(1);
    interMixedSequenceA.offer(2);
    interMixedSequenceA.offer(3);
    interMixedSequenceA.offer(4);
    interMixedSequenceA.offer(5);
    interMixedSequenceA.offer(6);
    interMixedSequenceA.offer(7);
    interMixedSequenceA.offer(8);
    interMixedSequenceA.offer(9);

    // [A] Print the initial sequence
    System.out.println("\na. Can be arranged\nInitial Sequence:  \t" + interMixedSequenceA);
    // [A] Dequeue and enqueue to rearranger sequence from 0 to 9
    System.out.println("Dequeued Sequence: \tUnnecessary");
    System.out.println("Enqueued Sequence: \tUnnecessary");
    // [A] Print final sequence 
    System.out.println("Final Sequence:    \t" + interMixedSequenceA);

            System.out.println();

    // [B] Offer integers to the queue
    interMixedSequenceB.offer(4);
    interMixedSequenceB.offer(6);
    interMixedSequenceB.offer(8);
    interMixedSequenceB.offer(7);
    interMixedSequenceB.offer(5);
    interMixedSequenceB.offer(3);
    interMixedSequenceB.offer(2);
    interMixedSequenceB.offer(9);
    interMixedSequenceB.offer(0);
    interMixedSequenceB.offer(1);

    // [B] Print the initial sequence
    System.out.println("b. Can be arranged\nInitial Sequence:  \t"+ interMixedSequenceB);
    // [B] Dequeue the values needed to be returned
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
    interMixedSequenceB.poll();
        System.out.println("Dequeued Sequence: \t"+ interMixedSequenceB);   // = 4, 6, 8, 7, 5, 3, 2, 9
    // [B] Enqueque to return the arranged values
    interMixedSequenceBdeq.offer(2);
    interMixedSequenceBdeq.offer(3);
    interMixedSequenceBdeq.offer(4);
    interMixedSequenceBdeq.offer(5);
    interMixedSequenceBdeq.offer(6);
    interMixedSequenceBdeq.offer(7);
    interMixedSequenceBdeq.offer(8);
    interMixedSequenceBdeq.offer(9);
        System.out.println("Enqueued Sequence: \t"+ interMixedSequenceB + interMixedSequenceBdeq);

            System.out.println();

    // [C] Offer integers to the queue
    interMixedSequenceC.offer(2);
    interMixedSequenceC.offer(5);
    interMixedSequenceC.offer(6);
    interMixedSequenceC.offer(7);
    interMixedSequenceC.offer(4);
    interMixedSequenceC.offer(8);
    interMixedSequenceC.offer(9);
    interMixedSequenceC.offer(3);
    interMixedSequenceC.offer(1);
    interMixedSequenceC.offer(0);

    // [C] Print the initial sequence
    System.out.println("c. Can be arranged\nInitial Sequence:  \t"+ interMixedSequenceC);
    // [B] Dequeue the values needed to be returned
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
    interMixedSequenceC.poll();
        System.out.println("Dequeued Sequence: \t"+ interMixedSequenceC);   //  = 2, 5, 6, 7, 4, 8, 9, 3, 1
    // [B] Enqueque to return the arranged values
    interMixedSequenceCdeq.offer(1);
    interMixedSequenceCdeq.offer(2);
    interMixedSequenceCdeq.offer(3);
    interMixedSequenceCdeq.offer(4);
    interMixedSequenceCdeq.offer(5);
    interMixedSequenceCdeq.offer(6);
    interMixedSequenceCdeq.offer(7);
    interMixedSequenceCdeq.offer(8);
    interMixedSequenceCdeq.offer(9);
        System.out.println("Enqueued Sequence: \t"+ interMixedSequenceC + interMixedSequenceCdeq);

              System.out.println();

    // [D] Offer integers to the queue D
    interMixedSequenceD.offer(4);
    interMixedSequenceD.offer(3);
    interMixedSequenceD.offer(2);
    interMixedSequenceD.offer(1);
    interMixedSequenceD.offer(0);
    interMixedSequenceD.offer(5);
    interMixedSequenceD.offer(6);
    interMixedSequenceD.offer(7);
    interMixedSequenceD.offer(8);
    interMixedSequenceD.offer(9);
        System.out.println("d. Cannot arranged\nInitial Sequence:  \t"+ interMixedSequenceD);
    // [D] Dequeue the values needed to be returned
    interMixedSequenceD.poll();
    interMixedSequenceD.poll();
    interMixedSequenceD.poll();
    interMixedSequenceD.poll();
        System.out.println("Dequeued Sequence: \t"+ interMixedSequenceD);   // = 4, 3, 2, 1, || 5, 6, 7, 8 , 9
    // [D] Dequeue the values needed to be returned
    interMixedSequenceDdeq.offer(1);
    interMixedSequenceDdeq.offer(2);
    interMixedSequenceDdeq.offer(3);
    interMixedSequenceDdeq.offer(4);
        System.out.println("Enqueued Sequence: \t"+ interMixedSequenceD + interMixedSequenceDdeq + "\n");

            lineBreak();

    System.out.println();
    }

    static void lineBreak() {
        System.out.println("=======================================================");
    }

}
