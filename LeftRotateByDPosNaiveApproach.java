public class LeftRotateByDPosNaiveApproach {
    public static void leftRotateOne(int arr[], int n) {
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];

        }

        temp = arr[n - 1];

    }

    public static void LeftRotate(int arr[], int d) {
        for (int i = 0; i < d; i++)
            leftRotateOne(arr, arr.length);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 6, 5, 4, 8 };
        LeftRotateByDPosNaiveApproach.LeftRotate(arr, 2);
    }
}