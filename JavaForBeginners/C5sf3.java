class C5sf3 {
    public static void main (String args[])    {
        double[] nums = new double[10];
        double sum = 0;

        for(int i = 0; i < 10; i++) {
            nums[i] = i*2.7;
        }
        for(double x: nums) {
            sum += x;
        }
        System.out.println(sum/nums.length);
    }
}
