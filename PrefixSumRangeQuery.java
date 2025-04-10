
public class PrefixSumRangeQuery {

    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        }
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 9, 3};
        int[] prefix = buildPrefixSum(arr);

        int L = 1, R = 4;
        System.out.println("Sum of range [" + L + ", " + R + "] = " + rangeSum(prefix, L, R));
    }
}
