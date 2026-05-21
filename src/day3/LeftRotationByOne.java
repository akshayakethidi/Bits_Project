package day3;

public class LeftRotationByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Store first element
        int first = arr[0];

        // Shift elements to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put first element at end
        arr[arr.length - 1] = first;

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
