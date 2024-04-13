public class code {
    /* Function to reverse arr[] from start to end */
    static void reverseArray(int arr[]) {
        int temp, start = 0, end = arr.length-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    /* Utility that prints out an array on a line */
    static void printArray(int arr[], String msg) {
        int size = arr.length;
        System.out.print(msg + ": [ ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("]");
    }
    public static void main(String args[]) {
        System.out.print("\033[H\033[2J");  // Cleans the Windows Terminal
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printArray(arr, "Original Array");
        reverseArray(arr);
        printArray(arr, "Reversed Array");
    }
}