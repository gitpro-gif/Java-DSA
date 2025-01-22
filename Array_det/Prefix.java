package Array_det;

public class Prefix {
    public static void MaxSubArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1; i<prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }


        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for(int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void Kadanes(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            max = Math.max(cs, max);
        }
        System.out.println("Our max subarray sum is : " + max);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);
    }
}
