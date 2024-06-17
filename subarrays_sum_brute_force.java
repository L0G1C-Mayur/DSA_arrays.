public class subarrays_sum_brute_force {
    public static void subarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curr_sum = 0;
                for (int k = i; k < j; k++) {
                    curr_sum += arr[k];
                    System.out.print(curr_sum);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarrays(arr);
    }
}
