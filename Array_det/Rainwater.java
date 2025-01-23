package Array_det;

public class Rainwater {

    public static int trappedRainwater(int height[]) {
        
        int n = height.length;
        int left_Max[] = new int[n];
        left_Max[0] = height[0];

        for (int i = 1; i < n; i++) { 
            left_Max[i] = Math.max(height[i], left_Max[i - 1]);
        }

        
        int Right_Max[] = new int[n];
        Right_Max[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            Right_Max[i] = Math.max(height[i], Right_Max[i + 1]);
        }

        
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left_Max[i], Right_Max[i]) - height[i];
            trappedWater += waterlevel;
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}
