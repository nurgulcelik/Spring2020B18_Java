package day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 5};
        int minimum = arr[0];
        for (int each : arr) {
            if (each < arr[0]) {
                minimum = each;
            }
        }
        System.out.println(minimum);
        int[] arr2 = {100, 200, 300, 40, -10, 20};
        System.out.println(minimum(arr2));
        double[] arr3={1.5,20.5,8.5,9.8};
        double num= minimum(arr3);
        System.out.println(arr3);
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < arr[0]) {
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr) {
        double minimum = arr[0];
        for (double each : arr) {
            if (each < arr[0]) {
                minimum = each;
            }
        }
        return minimum;
    }
}
