class FSDemo  {
    public static void main(String args[]) {
        failSoftArray fs = new failSoftArray(5, -1);
        int x;
        System.out.println("Fail quetly.");
        for ( int i = 0; i < (fs.length * 2); i ++)
            fs.put(i, i*10);
        
        for ( int i = 0; i < (fs.length * 2); i ++){
            x = fs.get(i);
        if (x != -1) System.out.print(x + " ");
    }
    System.out.println(" ");

    System.out.println("\nFail with error report.");
    for(int i = 0; i < (fs.length * 2); i ++) {
        x = fs.get(i);
        if(x != -1) System.out.print(x + " ");
        else    
            System.out.println("Index " + i + " out-of-bounds.");
        }   
    }       
}
