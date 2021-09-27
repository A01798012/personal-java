class Queue2 {
    char q[]; //this array holds dthe queue
    int putloc, getloc; // the put and get indices

    Queue2 (int size) {
        q = new char[size]; // allocate memory of the queue
        putloc = getloc = 0;
    }
// put character into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue2 is full.");
            return;
        }
        q[putloc++] = ch;
    }
//get character out of the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue2 is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}

class QDemo {
    public static void main(String args[]) {
        Queue2 bigQ = new Queue2(100);
        Queue2 smallQ = new Queue2(4);
        char ch;
        int i;

        //Put som numbers into bigQ
        System.out.println("Using bigQ to store the alphabet.");
        for(i = 0; i < 26 ; i++)
            bigQ.put((char) ('A' + i));
        
        //Retrieve and display elements of bigQ
        System.out.println("Content of bigQ: ");
        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.print("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i = 0; i < 5; i++) {
            System.out.print("Attempting ro store " + (char) ('Z'- i));
            smallQ.put((char) ('Z'-i));
            System.out.println();
         }
         System.out.println();
         //more error on smallQ
         System.out.print ("Contents of smallQ: ");
         for(i = 0; i < 5; i++) {
             ch = smallQ.get();

             if(ch != (char) 0) System.out.print(ch);
         }
    }
}