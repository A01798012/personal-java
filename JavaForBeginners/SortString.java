class SortString {
    public static void main(String args[])    {
        String[] myStrs = {"Mazda", "BMW", "Ford", "Volvo"};
        int a, b;
        String t;
        
        System.out.print("Original array of strings is: ");
        for(int i = 0; i < myStrs.length; i++)
            System.out.print(myStrs[i] + " ");
        System.out.println();

        for(a =1; a< myStrs.length; a++){
            for(b = myStrs.length - 1; b >= a; b--) {
                if(myStrs[b -1].compareTo(myStrs[b]) > 0) {
                    t = myStrs[b-1];
                    myStrs[b-1] = myStrs[b];
                    myStrs[b] = t;
                }
            }
        }
        System.out.print("Sorted strings are: ");
        for(String x: myStrs)
            System.out.print(x + " ");
        System.out.println();
    }
}
