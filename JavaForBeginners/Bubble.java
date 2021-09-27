class Bubble {
    public static void main(String args[])    {
        int[] nums = {3, -23, 4, 5 , 63, -2039, 39, 293, 0, 52123, -49342};

        int a, b, t;
        
        System.out.print("Original array is: ");
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        for(a =1; a< nums.length; a++){
            for(b = nums.length - 1; b >= a; b--) {
                if(nums[b -1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for(int x: nums)
            System.out.print(x + " ");
        System.out.println();
    }
}
