class Queue {
    private char q[];
    private int putloc, getloc;
    
    //Construc an empty Queue given its size
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Construct a queu from queue
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        // copy elements
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }
    //Construc a queue with initial values.
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
    }
    //put a character into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
//get character out of the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}
