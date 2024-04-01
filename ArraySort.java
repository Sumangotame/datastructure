import java.util.*;

public class ArraySort {

    public int[] Ascending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of Array");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter element of array");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        sc.close();
        ArraySort a = new ArraySort();
        int[] sortedArray=a.Ascending(array);
        System.out.println("sorted array is");

        for (int index = 0; index < array.length; index++) {
            System.out.println(sortedArray[index]);
        }
    }
}
